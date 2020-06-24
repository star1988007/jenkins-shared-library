 def call(String name = 'human') {
   echo "Hello, ${name}."
   stage('clone'){
   	echo "clone"

   }
   stage('test'){
   	echo 'test'

   }
   stage('build'){
   	echo 'build'

   }

   stage('容器镜像构建'){
   	echo 'docker build'

   }

   stage('deploy to k8s'){
   	echo 'deploy'

   }
 }
