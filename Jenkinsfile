pipeline {

    environment {
        registry = "ravikiran2402/scientific-caclulator"
        registryCredential = 'ravidh'
        dockerImage = ''
    }

    agent any

    stages {
        stage('Clean') {
            steps {
                sh 'sudo mvn clean'
            }
        }
        stage('Validate') {
            steps {
                sh 'sudo mvn validate'
            }
        }
        stage('Test') {
            steps {
                sh 'sudo mvn test'
            }
        }
        stage('Install Node packages') {
            steps {
                dir('src/main/ui') {
                    sh 'npm install'
                }
            }
        }
        stage('Making Production build for frontend') {
            steps {
                dir('src/main/ui') {
                    sh 'npm run build'
                }
            }
        }
        stage('Maven Install') {
            steps {
                sh 'sudo mvn install'
            }
        }
        stage('Build docker image') {
            steps { 
                dir('docker'){
                    script {
                        dockerImage = docker.build registry + ":$BUILD_NUMBER"
                    }
                }
            } 
        }
        stage('Push image'){
            steps {
                dir('docker'){
                    script {
                        docker.withRegistry( '', registryCredential ) {
                            dockerImage.push()
                        
                        }
                    }
                }
            }
        }
        stage('Remove redundant docker images'){
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
                sh "docker image prune"
            }
        }
        stage('Deploy on Rundeck'){
            steps{
                script{
                    step([
                        $class: "RundeckNotifier",
                        rundeckInstance: "rundeck-instance",
                        options: """ tag=$BUILD_NUMBER""",
                        jobId: "b8a26087-f26f-4997-92a3-64dfc247a722",
                        shouldFailTheBuild: true,
                    ])
                }
            }
        }
    }
}
