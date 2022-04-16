pipeline
{
    environment
    {
        registry="matehate/calcdevops123:v{$BUILD_NUMBER}"
        registry_credential="SPE_Docker"
        dockerimage=""
    }
    agent any

    triggers
    {
        githubPush()
    }

    stages
    {
        stage("Get code")
        {
            steps
            {
                git "https://github.com/matehate/calcdevops123"
            }
        }
        stage("Test code")
        {
            steps
            {
                sh "mvn clean test"
            }
        }
        stage("Build")
        {
            steps
            {
                sh "mvn -B -DskipTests clean package"
            }
        }
        stage("Docker Build Image")
        {
            steps
            {
                script
                {
                    dockerimage = docker.build registry
                }
            }
        }
        stage('Push image to docker hub')
        {
            steps
            {
                script
                {
                    docker.withRegistry('', registry_credential)
                    {
                        dockerimage.push()
                    }
                }
            }
        }
        stage('Node deploy')
        {
            steps
            {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'calc-dep.yml'
            }
        }
    }
}