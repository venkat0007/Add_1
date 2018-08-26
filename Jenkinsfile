pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(branch: 'master', url: 'https://github.com/venkat0007/Add_1.git', credentialsId: 'jenkinsgithub')
      }
    }
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh '/root/apache-maven-3.5.4/bin/mvn -V clean compile'
          }
        }
        stage('echo') {
          steps {
            echo 'build completed'
          }
        }
      }
    }
    stage('') {
      steps {
        git(url: 'https://github.com/DIGITALAPPLICATION/WebApp.git', branch: 'master', credentialsId: 'jenkinsgithub', poll: true)
      }
    }
  }
}