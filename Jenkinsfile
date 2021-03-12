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
        // stage('Install Node packages') {
        //     steps {
        //         dir('src/main/ui') {
        //             sh 'npm clean-install'
        //         }
        //     }
        // }
        // stage('Making Production build for frontend') {
        //             steps {
        //                 dir('src/main/ui') {
        //                     sh 'npm run build'
        //                 }
        //             }
        //         }
        // stage('Package') {
        //     steps {
        //         sh 'sudo mvn package'
        //     }
        // }
    }
}