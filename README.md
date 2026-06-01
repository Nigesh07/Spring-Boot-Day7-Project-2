# Day7proj2 Spring Boot Application

## Overview
This is a simple Spring Boot application demonstrating REST endpoints for greeting and addition operations.

## Prerequisites
- Java 17 or later (JDK)
- Maven
- Internet access to download dependencies

## Run the application
From the project root folder, run:

```bash
./mvnw spring-boot:run
```

On Windows you can also run:

```powershell
mvnw.cmd spring-boot:run
```

Once started, the application listens on `http://localhost:9090`.

## API Endpoints

### GET /hello
Returns a welcome message.

```http
GET http://localhost:9090/hello
```

Example response:

```text
Welcome to SpringBoot
```

#### Screenshot
![Hello Endpoint]([Screenshot 2026-06-01 204301.png](https://github.com/Nigesh07/Spring-Boot-Day7-Project-2/blob/e58d17789c44a26b4e2eb5a6d2c320676c6f6baf/Screenshot%202026-06-01%20204301.png))

### GET /hello/{name}
Returns a personalized greeting.

```http
GET http://localhost:9090/hello/John
```

Example response:

```text
Hello, John Welcome to Spring Boot
```

#### Screenshot
![Hello Name Endpoint]([screenshots/hello-name-endpoint.png](https://github.com/Nigesh07/Spring-Boot-Day7-Project-2/blob/e58d17789c44a26b4e2eb5a6d2c320676c6f6baf/Screenshot%202026-06-01%20204327.png))

### GET /add
Returns the sum of two query parameters `a` and `b`.

```http
GET http://localhost:9090/add?a=5&b=7
```

Example response:

```text
12
```



## Project structure
- `src/main/java`: application source code
- `src/main/resources`: Spring Boot resources and configuration
- `src/test/java`: unit tests

## Notes
- If the screenshots are not visible, place PNG images in the `screenshots/` folder using the names shown above.
- Update the screenshot filenames if you use different captures.

## Useful commands

```bash
./mvnw test
./mvnw package
```

## Contact
If you want to extend the project, add more REST endpoints or explore Spring Boot controllers in `src/main/java/com/example/day7proj2/helloproject/controller`.
