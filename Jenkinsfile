pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(branch: 'master', url: 'https://github.com/venkat0007/Add_1.git', credentialsId: 'jenkinsgithub')
      }
    }
  }
}