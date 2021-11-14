# Getting Started

## To find the next highest number using the same digits
This is a spring boot application that can be used to find the next highest
number with the same digits. The application uses gradle to build the project.
The application expects the number to be passed as a command line argument.

The application can be built using the following command:

```shell
./gradlew build
```

After the application has been built, it can be run using the following command:

```shell
./gradlew bootRun --args=input
```

_Note: The input should be a valid integer. If it's not, the application will return
0 as the output. The application also returns 0 if there is no solution._
