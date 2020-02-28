pipelineJob('Build') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline_templates/Build_job.groovy'))
            sandbox()
        }
    }
}
