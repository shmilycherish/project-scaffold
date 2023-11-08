# Use the official gradle/Java 17 image to create a build artifact.
# https://hub.docker.com/_/gradle
FROM gradle:jdk17-alpine AS builder
# Copy local code to the container image.
WORKDIR /app

# copy Gradle build file
COPY build.gradle ./docker
COPY settings.gradle ./

# copy source code
COPY src ./src

# build project
RUN gradle clean build

# Build a release artifact.
EXPOSE 8080

#Run the web service on container startup.
CMD ["java", "-jar", "/app/build/libs/project-scaffold-0.0.1-SNAPSHOT.jar"]
