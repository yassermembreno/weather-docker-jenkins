FROM amazoncorretto:17-alpine
VOLUME /tmp
COPY build/libs/*.jar weather.jar
ENTRYPOINT ["java", "-jar", "/weather.jar"]