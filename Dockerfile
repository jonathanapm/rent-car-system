FROM amazoncorretto:17
MAINTAINER github/jonathanapm
COPY ./build/libs/rent-car-system-1.0.0-SNAPSHOT.jar /app/rent-car-system.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "rent-car-system.jar"]
EXPOSE 8080
