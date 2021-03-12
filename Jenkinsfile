pipeline {

    environment {
        registry = "ravikiran2402/scientific-caclulator"
        dockerCredential = 'ravidh'
        dockerImg = ''
    }

    agent any

    stages {
        stage('Clone Git') {
            steps {
                git branch: 'mnv', url: 'https://github.com/Ravikiran2402/SPEMiniProject'
            }
        }
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
            dockerImg = docker.build(registry)
        }
        stage('Push image'){
            docker.withRegistry('https://registry.hub.docker.com', dockerCredential ) {
                dockerImg.push("${env.BUILD_NUMBER}")
                dockerImg.push("latest")
            } 
        }
    }
}