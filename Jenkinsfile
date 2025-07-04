pipeline {
    agent any

    stages {
        stage('Build') {
            // agente é container docker com Maven e Java 11
            agent {
                docker { image 'maven:3.8-openjdk-11' }
            }
            steps {
                echo 'Iniciando o processo de build...'
                // o comando 'mvn clean package' compila o código e empacota em um .jar
                // '-DskipTests' pula os testes, pois teremos um estágio só para eles
                sh 'mvn -B clean package -DskipTests'
            }
            post {
                // guarda o arquivo .jar para o próximo estágio.
                success {
                    echo 'Build concluído com sucesso. Guardando o artefato...'
                    stash name: 'java-app', includes: 'target/*.jar'
                }
            }
        }

        stage('Test') {
            agent {
                docker { image 'maven:3.8-openjdk-11' }
            }
            steps {
                echo 'Iniciando o processo de teste...'
                // recupera o .jar que foi guardado no estágio de build
                unstash 'java-app'
                // executa os testes usando o Maven
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finalizado.'
            // coleta os resultados dos testes para exibição na interface do Jenkins
            junit 'target/surefire-reports/*.xml'

            // limpa o workspace no final
            cleanWs()
        }
    }
}