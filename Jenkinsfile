pipeline {
  agent {
    node {
      label 'microservice'
    }

  }
  stages {
    stage('git pull') {
      steps {
        git(url: 'https://github.com/23Logesh/MicroService_Asynchroronize_Serialization-handShack.git', branch: 'main', changelog: true)
      }
    }

  }
}