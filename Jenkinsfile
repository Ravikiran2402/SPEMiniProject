pipeline {
    agent any

    stages {
        stage('Clone Git') {
            steps {
                git 'https://github.com/Ravikiran2402/SPEMiniProject.git'
            }
        }
        stage('Clean and install') {
            steps {
                sh 'sudo mvn clean install'
            }
        }
    }
}