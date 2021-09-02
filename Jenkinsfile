node {
    stage("Clean Workspace") {
        cleanWs()
    }

      stage("Get code"){
          git branch: "master", url: 'https://github.com/AlexandrUrbanovich/ATMPAdvanced.git'
      }

      stage('Test'){
        script {
            currentBuild.displayName = currentBuild.displayName + " testng-smoke chrome"
        }
        catchError {
            sh "mvn clean test -DsuiteFile=./src/test/resources/testng-smoke.xml -Dbrowser=chrome"
        }
      }


      stage('Report') {
              step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])

      }
}