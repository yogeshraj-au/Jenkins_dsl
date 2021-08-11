String basePath = 'dsljobs'
String repo = 'https://github.com/yogeshraj-au/Jenkins_examplegroovy_scripts.git'

folder(basePath) {
  description 'DSL generated folder.'
}

pipelineJob("$basePath/status") {
  description()
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url(repo)
          }
          withCredentials(bindings: 'ef28acbe-2b70-4d27-bc4e-e705887d4a85')
          branch("*/master")
        }
      }
      script(readFileFromWorkspace('Jenkins_examplegroovy_scripts\SharedLibrary_audittools\Jenkinsfile'))
    }
  }
}


checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'ef28acbe-2b70-4d27-bc4e-e705887d4a85', url: 'https://github.com/yogeshraj-au/Jenkins_examplegroovy_scripts.git']]])