def call(image ,tag){
  // sh "docker build -t ${image}:${tag} ." // this is for linux
   bat "docker build -t ${image}:${tag} ." // this is for windows 
}
