# Maven Multi-Module Project

- `core`: models (POJOs), uses Jackson
- `app`: main class, depends on `core`

## Build
    mvn clean install

## Run
    mvn -pl app exec:java
