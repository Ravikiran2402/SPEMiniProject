pipeline {
    agent any

    stages {
        stage('Clone Git') {
            steps {
                git branch: 'mnv', url: 'https://github.com/Ravikiran2402/SPEMiniProject'
            }
        }
        stage('Clean') {
            steps {
                sh 'sudo mvn clean install'
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
    }
}