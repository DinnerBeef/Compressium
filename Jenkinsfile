pipeline {
   agent any
   stages {

      stage ('Build') {
         steps {
            sh "rm -rf build/libs/"
            sh "chmod +x gradlew"
            sh "./gradlew build"

            archiveArtifacts artifacts: '**/build/libs/*.jar'
         }
      stage ('Post') {
         always {
            discordSend title: JOB_NAME, link: env.BUILD_URL, result: currentBuild.currentResult,webhookURL: ${env.DISCORD_WEBHOOK_URL}
         }
      }
      }
   }
}
