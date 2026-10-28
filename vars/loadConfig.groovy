// Task 19: reads a file from this library's resources/ folder and returns it as a map
// JsonSlurperClassic (not JsonSlurper): its result can be saved between pipeline steps
import groovy.json.JsonSlurperClassic

def call(String fileName = 'config.json') {
    def fileContent = libraryResource(fileName)
    return new JsonSlurperClassic().parseText(fileContent)
}
