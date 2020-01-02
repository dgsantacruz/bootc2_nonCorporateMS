#This is the base.
FROM java:8

#This is the port.
EXPOSE 8011:8011

#No idea
ADD /target/personalClientDocker.jar personalClientDocker.jar

#No idea
ENTRYPOINT ["java", "-jar", "personalClientDocker.jar"]