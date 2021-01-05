FROM openjdk:8
VOLUME /tmp
COPY target /target
ENTRYPOINT ["java","-jar","/target/JsonConsumer-1.0-SNAPSHOT.jar"]