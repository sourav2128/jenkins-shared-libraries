def call(String usernameVariable,String passwordVariable, String ProjectName, String ImageTag){
  sh "docker login -u ${usernameVariable} -p ${passwordVariable}"
  sh "docker push ${usernameVariable}/${ProjectName}:${ImageTag}"
}
