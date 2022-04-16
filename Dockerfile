FROM openjdk:8
COPY ./target/calc_dev_ops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calc_dev_ops-1.0-SNAPSHOT-jar-with-dependencies.jar"]
