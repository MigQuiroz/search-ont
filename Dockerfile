FROM openjdk:11
VOLUME /tmp
EXPOSE 8083
ARG JAR_FILE=target/search-ont-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} search-ont.jar
ENTRYPOINT ["java","-jar","search-ont.jar"]
