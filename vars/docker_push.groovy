def call(String dockerhubUser, String ProjectName, String ImageTag){
   withCredentials([usernamePassword(
                    credentialsId:"dockerhubCred",
                    usernameVariable:"dockerhubUser",
                    passwordVariable:"dockerhubPassword")]){
                         sh "docker login -u ${dockerhubUser} -p ${dockerhubPassword}"
                         sh "docker push ${dockerhubUser}/${ProjectName}:${ImageTag}"
                        
                    }
}
