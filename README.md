# quarkus-ext-test

`./gradlew clean build` should be successful

publish the jar by ./gradlew publishToMavenLocal -x test, go to test-app folder, run

./gradlew quarkuDev
followed by curl localhost:8080/sayHello proves it's working.
