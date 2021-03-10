# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# Copy war file
COPY scientificcalc-0.0.1-SNAPSHOT.jar /scientificcalc.war

# run the app
CMD ["/usr/bin/java", "-jar", "/scientificcalc.war"]