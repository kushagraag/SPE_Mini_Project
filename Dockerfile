FROM openjdk:11
COPY ./target/ScientificCalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "ScientificCalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar", "org/example"]