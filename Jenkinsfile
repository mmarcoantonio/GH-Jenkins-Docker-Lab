pipeline {
    agent any

    stages {
        stage('Build') {
            agent {
                dockerfile {
                    filename 'Dockerfile.build'
                    dir '.'
                }
            }
            steps {
                echo 'Etapa de compilação'
                sh 'javac Conversor.java'
            }
        }

        stage('Test') {
            agent {
                dockerfile {
                    filename 'Dockerfile.test'
                    dir '.'
                }
            }
            steps {
                echo 'Etapa de testes'
                sh 'java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ConversorTest'
            }
        }
    }
}

