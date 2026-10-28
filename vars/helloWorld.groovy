// Called from a pipeline as: helloWorld() or helloWorld('Efri')
// The file name (helloWorld) becomes the step name; call() is what runs.
def call(String name = 'World') {
    echo "Hello, ${name} from Jenkins Shared Library!"
}
