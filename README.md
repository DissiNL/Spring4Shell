# Example of shell exploit

1) Build java:
```cmd
mvn package
```


2) Build container

```cmd
docker build -t tomcat-example .
```


3) Run:
```cmd
docker run -d -p 8080:8080 tomcat-example
```


4) Run python attack:

```cmd
python exploit.py
```


### Done!

Shell should be available at:
`http://localhost:8080/shell.jsp?cmd=id`


### Run with workaround

Enables the controller advice specified in [BinderControllerAdvice](src/main/java/com/dissi/serializationdemo/BinderControllerAdvice.java)

```cmd
docker run -e "SPRING_PROFILES_ACTIVE=fix" -d -p 8080:8080 tomcat-example`
```

If you now run the exploit `python exploit.py` it will not create the file shell.js.  
Please beware that this is not a complete workaround until the actual issue is fixed.
