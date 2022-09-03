FROM amazoncorretto:17
MAINTAINER github/jonathanapm
COPY ./build/libs/rent-car-system-0.0.1-SNAPSHOT-plain.jar /app/rent-car-system.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "rent-car-system.jar"]
EXPOSE 8080
