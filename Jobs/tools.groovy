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
          branch("master")
        }
      }
      script(readFileFromWorkspace('SharedLibrary_audittools\Jenkinsfile'))
    }
  }
}