pipeline {
    agent {
        docker { image 'alpine-jdk17' }
    } 
    options{
        skipStagesAfterUnstable()
    }
    stages {
        stage (sourceCode) {
            steps {
                echo 'checkout sourceCode'
            }
            
        }
        stage (build) {
            steps {
                echo 'build project'
                sh 'gradle clean'
                sh 'gradle build'
            }            
        }
        stage (test) {
            steps{
                echo 'test project'
            }                 
        }
    }
}
