node {
    def mvnHome
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        git 'https://github.com/vinaconc/Prueba3.git'
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        // **       in the global configuration.
        mvnHome = tool 'MAVEN'
    }
    stage('Build') {
        // Run the maven build
        withEnv(["MVN_HOME=$mvnHome"]) {
            if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
            } else {
                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
               
            }
        }
    }
    stage('Results') {
        
    
         archiveArtifacts artifacts: 'target/surefire-reports/emailable-report.html',  followSymlinks: false
 archiveArtifacts artifacts: '**/target/*.war',  followSymlinks: false

     
junit allowEmptyResults: true, skipMarkingBuildUnstable: true, skipPublishingChecks: true, testResults: '**/target/surefire-reports/TEST-*.xml'
    }
     
}
