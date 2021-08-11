folder('dsljobs') {
    displayName('dsljobs')
    description('Folder for dsl jobs')
}

pipelineJob("dsljobs/github-demo") {
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