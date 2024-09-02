pipeline {
    agent any
    // options {
    //     skipStagesAfterUnstable()
    // }
    stages {
        stage('Pull') {
            steps {
                echo 'code pulled successfully'
            }
        }
        stage('Build') {
            steps {
                echo 'code build successfully'
            }
        }
        stage('Test'){
            steps {
                echo 'code test successfully'
            }
        }
        stage('Deploy') {
            steps {
                echo 'code deployed successfully'
            }
        }
    }
}