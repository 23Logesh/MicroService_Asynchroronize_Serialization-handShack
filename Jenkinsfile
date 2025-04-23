pipeline {
    agent {
        node {
            label 'microservice'
        }
    }

    stages {
        stage('Clone') {
            steps {
                git(
                    url: 'https://github.com/23Logesh/MicroService_Asynchroronize_Serialization-handShack.git',
                    branch: 'main',
                    changelog: true
                )
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests... Running tests... Unit test not return'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application...'
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Example deploy: copying jar to deployment directory or calling a script
                sh 'cp target/*.jar /opt/deployments/'
            }
        }
    }
}
