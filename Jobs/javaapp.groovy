pipelineJob("dsljobs/javabuild") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('yogeshraj-au/java_app')
                        credentials('ef28acbe-2b70-4d27-bc4e-e705887d4a85')
                    }
                 branch('*/master')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}