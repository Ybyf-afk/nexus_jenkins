pipelineJob('Build') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/pipeline_templates/Build_job.groovy'))
            sandbox()
        }
    }
}
