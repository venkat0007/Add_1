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
  }
}