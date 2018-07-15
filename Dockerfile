FROM openjdk:8
ADD target/wtfb.jar wtfb.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "wtfb.jar"]