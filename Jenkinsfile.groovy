pipeline{
    agent any
    stages{
        stage("run packer"){
            steps{
                sh "packer build  -var-file=versions image.json"
            }
        }
    }
}