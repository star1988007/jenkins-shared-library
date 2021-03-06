def call(String appname = 'jdk',String tag,String denv,String target) {
   echo "Hello, ${appname}."
   stage('Clone') {
      echo "clone"
      sh """
       /tmp/test.sh ${appname} ${tag}  ${denv} ${target}
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
      sh """
      python /tmp/test.py  ${appname}   ${denv} ${tag}
      """
   }
}
