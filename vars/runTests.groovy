def call(String testCommand = 'mvn test') {
    stage('Run Tests') {
        echo "Running tests using command: 1 ${testCommand}"
        echo "Running tests using command: 2 ${testCommand}"
        echo "Running tests using command: 3 ${testCommand}"
        echo "Running tests using command:4 ${testCommand}"
        echo "Running tests using command:5 ${testCommand}"
        echo "Running tests using command:6 ${testCommand}"

    }
}
