pipeline {
    agent any

    stages {
        stage('Clean workspace') {
            steps{
                deleteDir()
            }
        }
        stage('Clone Git') {
            steps {
                git 'https://github.com/Ravikiran2402/SPEMiniProject.git'
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
        stage('Install') {
            steps {
                sh 'sudo mvn install'
            }
        }
        stage('Install Node packages') {
            steps {
                dir('src/main/ui') {
                    sh 'npm clean-install'
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
        stage('Package') {
            steps {
                sh 'sudo mvn package'
            }
        }
    }
}