 def call(String name = 'human') {
   echo "Hello, ${name}."
   stage('Clone'){
   	echo "clone"
   	sh """
   		sh echo
   		"""

   }
   stage('Test'){
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
