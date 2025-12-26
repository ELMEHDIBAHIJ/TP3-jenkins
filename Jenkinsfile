pipeline{
   agent any 
 
 environment { 
  IMAGE_NAME = "tp3-java-app:latest" 
  CONTAINER_NAME = "tp3-java-container" 
  HOST_PORT = "8081" 
  CONTAINER_PORT = "8080" } 
  stages { 
    stage('Checkout') { 
      steps { 
        git branch: 'main', url: 'https://github.com/USER/REPO.git' 
           }
    } 

    stage('Build') { 
      steps {
         sh 'mvn -B clean package -DskipTests' 
         } 
    }
    stage('Test') { 
      steps { 
        sh 'mvn -B test' 
      } 
      post { 
        always { junit '**/target/surefire-reports/*.xml' } 
        } 
    }
    }
    }
