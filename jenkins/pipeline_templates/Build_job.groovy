pipeline {
   agent any

   tools {
      
      maven 'maven3'
   }

   stages {
      stage('Build') {
         steps {
           
            git 'https://github.com/Ybyf-afk/spring-petclinic.git'

            
            sh "mvn -Dmaven.test.failure.ignore=true clean package"
         }

         post {
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
            }
         }
      }
   }
}

