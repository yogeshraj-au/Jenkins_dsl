String basePath = 'dsljobs'

folder(basePath) {
  description 'DSL generated folder.'
}

pipelineJob("$basepath/github-demo") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('jenkinsci/pipeline-examples')
                    }
                }
            }
            scriptPath('declarative-examples/simple-examples/environmentInStage.groovy')
        }
    }
}