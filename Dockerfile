FROM openjdk:11
ADD /client1-0.0.1-SNAPSHOT.jar client1.jar
ENTRYPOINT ["java", "-jar", "client1.jar"]