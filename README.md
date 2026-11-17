# Hello World Maven Java Project

A simple Maven project demonstrating standard Java project structure, compilation, testing, packaging, and execution.

## Project Structure

```text
.
├── pom.xml
├── .gitignore
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java
```

## Useful Maven Commands

1. **Compile code**:
   ```bash
   mvn compile
   ```

2. **Run tests**:
   ```bash
   mvn test
   ```

3. **Package application into a JAR**:
   ```bash
   mvn clean package
   ```

4. **Run application via Maven Exec Plugin**:
   ```bash
   mvn exec:java
   ```

5. **Run packaged JAR**:
   ```bash
   java -jar target/hello-world-app-1.0-SNAPSHOT.jar
   ```
