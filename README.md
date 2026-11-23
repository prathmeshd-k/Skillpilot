# Maven Multi-Module Project

This Java 17 example is a Maven reactor project with two modules:

- `core`: reusable domain model classes, including the `User` POJO.
- `app`: the executable application; depends on `core` and uses Jackson to serialize a model.

## Project layout

```text
maven-multi-module/
├── pom.xml
├── core/
│   ├── pom.xml
│   └── src/main/java/com/example/core/model/User.java
└── app/
    ├── pom.xml
    └── src/main/java/com/example/app/Main.java
```

The root `pom.xml` uses `pom` packaging and lists `core` and `app` as reactor modules. Each module POM inherits the root coordinates and Java compiler configuration. To add another module:

1. Create a directory at the project root and add a `pom.xml` with the root project as its parent.
2. Set that module's `artifactId` and add Java files under `src/main/java`.
3. Add the directory name to the root `<modules>` list.
4. Declare the new module as a dependency in any module that uses it.

For example, `app` declares `core` as a dependency, and the root reactor builds `core` before `app`.

## Build

From this directory, install both modules:

```sh
mvn clean install
```

## Run

After building and installing the reactor from the project root, run the app module:

```sh
mvn clean install
mvn -pl app exec:java
```

The application prints:

```text
User{id=1, name='Prathmesh'}
{"id":1,"name":"Prathmesh"}
```
