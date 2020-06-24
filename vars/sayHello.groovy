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

   stage('deploy'){
   	echo 'deploy'

   }
 }
