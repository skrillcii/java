# Java Workspace

This is a java workspace to understand basics of java and also the usage of maven throught the development cycles.

## Prerequistist

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

Run packed program
```
java -cp target/... ...java.App
```

Pack program, which inculdes Junit testing
```
mvn package
```

Run test solely
```
mvn test
```

Remove all build results
```
maven clean
```

## References
[Maven for buidling java applications](https://www.vogella.com/tutorials/ApacheMaven/article.html#:~:text=Maven%20provides%20a%20command%20line,phase%20or%20goal%20to%20execute.)
