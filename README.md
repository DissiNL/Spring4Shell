# Example of shell exploit

Build java:
`mvn package`
Build container:
`docker build -t tomcat-example .`


Run:
`docker run -d -p 8080:8080 tomcat-example`


Run python attack:

`python exploit.py`


Shell should be at:
`http://localhost:8080/shell.jsp?cmd=id`
