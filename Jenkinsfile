pipeline {
    agent any

    stages {
        stage('Clone Git') {
            steps {
                git branch: 'mnv', url: 'https://github.com/Ravikiran2402/SPEMiniProject'
            }
        }
        stage('Clean and install') {
            steps {
                sh 'sudo mvn clean install'
            }
        }
    }
}