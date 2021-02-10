# Java Workspace
This is to show bridge java runtime with python runtime using py4j

## Prerequisite
* [Ubuntu 20.04](https://releases.ubuntu.com/20.04/)
* [OpenJDK 11](https://openjdk.java.net/)
* [py4j 0.10](https://www.py4j.org/#)

## Use Case of AdditionApplication
Compile
```
$ javac -cp ~/.pyenv/versions/3.x.x/share/py4j/* AdditionApplication.java
```

Execute
```
$ java -cp ~/.pyenv/versions/3.x.x/share/py4j/*. AdditionApplication
```

Initiate python runtime
```
$ python3 AdditionApplication.py
```
