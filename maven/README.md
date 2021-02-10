# Java Maven

This shows an example usage of a maven project

## Prerequisite

* [Maven 3.6](https://maven.apache.org/)
* [OpenJDK 11](https://openjdk.java.net/)
* [Ubuntu 20.04](https://releases.ubuntu.com/20.04/)

```
sudo apt-get install -y default-jre default-jdk maven
```

## Useful Commands

Create maven project, called my-app
```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Clean before build
```
maven clean install
```

Clean before build and skipping tests
```
mvn clean install -DskipTests=false
```

Compile, which includes resolving dependencies, building sources, executing Junit test
```
maven compile
```

Clean build artifcats
```
mvn clean package
```

Run compiled and packaged JAR program
```
java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
```

Pack program, which inculdes Junit testing
```
mvn package
```

Run test solely on all tests within the project
```
mvn test
```

Run test solely on specified test class
```
mvn -Dtest=AppTest test
```

Run test solely on specified test class's unit test
```
mvn -Dtest=AppTest#shouldAnswerWithTrue test
```

Remove all build results
```
maven clean
```

## References
[Welcom to Apache Maven](https://maven.apache.org/index.html)
[Maven for buidling java applications](https://www.vogella.com/tutorials/ApacheMaven/article.html#:~:text=Maven%20provides%20a%20command%20line,phase%20or%20goal%20to%20execute.)
