pipeline {
    agent any

    stages {
        stage('Clone Git') {
            steps {
                git 'https://github.com/Ravikiran2402/SPETestProject.git'
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Validate') {
            steps {
                sh 'mvn validate'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Install Node packages') {
            steps {
                dir('src/main/ui') {
                    sh 'npm install'
                }
            }
        }
        stage('Run front end') {
            steps {
                dir('src/main/ui') {
                    sh 'npm run dev'
                }
            }
        }
    }
}