def call(image ,tag){
  echo "this build command is form groovy file"
  // sh "docker build -t ${image}:${tag} ." // this is for linux
   bat "docker build -t ${image}:${tag} ." // this is for windows 
}
