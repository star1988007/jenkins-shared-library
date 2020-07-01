def call(String appname = 'jdk',String denv="test") {
   echo "Hello, ${appname}."
   stage('Clone') {
      echo "clone"
      sh """
       python /tmp/test.py
       /tmp/test.sh ${appname} ${denv}
       """
      }
   stage('Test') {
      echo 'test'

   }
   stage('Build'){
      echo 'build'

   }

   stage('容器镜像构建'){
      echo 'docker build'

   }

   stage('Deploy to k8s'){
      echo 'deploy'

   }
}
