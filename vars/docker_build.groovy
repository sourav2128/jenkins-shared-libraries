def call(String dockerhubUser, String ProjectName, String ImageTag){
  sh "docker build -t ${dockerhubUser}/${ProjectName}:${ImageTag} ."
}
