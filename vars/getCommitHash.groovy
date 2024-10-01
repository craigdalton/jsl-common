/**
 * getCommitHash returns the current git commit hash.
 */
def call(Map opts = [:]) {
    sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
}