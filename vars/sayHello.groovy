 def call(String name = 'jdk') {
   echo "Hello, ${name}."
   stage('Clone'){
   	echo "clone"
   	sh """
   	 python /tmp/test.py
     /tmp/test.sh ${name}
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
