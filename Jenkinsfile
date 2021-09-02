node {
    stage("Clean Workspace") {
        cleanWs()
    }

      stage("Get code"){
          git branch: "${branch}", url: 'https://github.com/AlexandrUrbanovich/ATMPAdvanced.git'
      }

      stage('Test'){
        script {
            currentBuild.displayName = currentBuild.displayName + " ${suiteFile} ${browserName}"
        }
        catchError {
            sh "mvn clean test -DsuiteFile=./src/test/resources/${suiteFile}.xml -Dbrowser=${browserName}"
        }
      }


      stage('Report') {
              step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])

      }
}