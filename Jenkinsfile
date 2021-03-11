pipeline {
    agent any

    stages {
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
    }
}