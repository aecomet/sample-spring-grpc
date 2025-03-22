# sample-spring-grpc

Sample gRPC Application for Java Spring

```sh
# run app
$ gradle bootRun
# or ./gradlew bootRun

# run test
$ gradle test

# docker build
$ docker buildx build -t sample-spring-grpc:latest .
```

## JDK

We use openjdk

used version -> [here](./.java-version)

download from: https://adoptium.net/

## Spring

see: [Official tutorial](https://spring.io/guides)

## Gradle

see: [Official tutorial](https://docs.gradle.org/current/userguide/installation.html#gs:installation)

## Tips

vscode not recognize the import org.junit?

> Try this VS Code command...
> View -> Command Palette -> Java: Clean Java Language Server Workspace
> ref: https://stackoverflow.com/questions/62075442/why-does-vscode-not-recognize-the-import-org-junit
