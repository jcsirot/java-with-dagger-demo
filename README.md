# java-with-dagger-demo

This project contains a very simple demo of the [dagger.io](https://dagger.io/) java SDK. It 
reproduces the dagger sample code visible on the dagger homepage.

## build

### Java SDK

The Java SDK is part of the [dagger/dagger](https://github.com/dagger/dagger) git repository.

Build the Java SDK according to the [documentation](https://github.com/dagger/dagger/blob/main/sdk/java/README.md)

Make sure that you install it to your local maven cache.

### Dagger demo

```shell
$ ./gradlew build
```

## run

Run the demo code

```shell
$ ./gradlew run
```

### use Dagger CLI

To run a Java pipeline the Java SDK is needed as jar file containing all dependencies.

This self-contained jar can be built with this command:


```shell
$ ./gradlew customFatJar
```

The following command uses the Dagger CLI to start the demo code:

```shell
$ dagger run java -cp app/build/libs/all-in-one-jar.jar org.chelonix.dagger.demo.App
```
