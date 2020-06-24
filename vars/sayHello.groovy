 def call(String name = 'human') {
   echo "Hello, ${name}."
   agent any 

   stage('test'){
   	echo "test"

   }
 }
