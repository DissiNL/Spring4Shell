FROM tomcat:9.0.50-jdk11-openjdk

ADD target/vulnerability-demo-docker-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/example.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
