FROM adoptopenjdk/openjdk8-openj9:alpine-slim

COPY target/downstream-service.jar /

ENTRYPOINT ["java", "-jar", "downstream-service.jar" ]
