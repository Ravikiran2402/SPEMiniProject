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
        stage('Clean static folder') {
            steps {
                dir('src/main/resources/static/') {
                    sh 'rm -rf *'
                }
            }
        }
        stage('Copy vue code to static dir') {
            steps{
                sh 'cp src/main/ui/dist/**/* src/main/resources/static/'
            }
        }
    }
}