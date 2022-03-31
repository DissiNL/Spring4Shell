# Example of shell exploit

1) Build java:
`mvn package`


2) Build container:
`docker build -t tomcat-example .`


3) Run:
`docker run -d -p 8080:8080 tomcat-example`


4) Run python attack:

`python exploit.py`


### Done!

Shell should be available at:
`http://localhost:8080/shell.jsp?cmd=id`


### Run with workaround:

`docker run -e "SPRING_PROFILES_ACTIVE=fix" -d -p 8080:8080 tomcat-example`
