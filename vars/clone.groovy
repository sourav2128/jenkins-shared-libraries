def call(String url, String branch){
  echo "cloning the git url"
  git url:"${url}",branch:"${branch}"
}
