package com.dissi.serializationdemo;

import java.io.IOException;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SerializationDemoApplication extends SpringBootServletInitializer {
    private static final Logger log = Logger.getLogger(SerializationDemoApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SerializationDemoApplication.class, args);
    }

    @PostConstruct
    public void showLoad() throws IOException {
        log.info("Loaded simple web application.");
        log.info("Displaying information about hostname:");
        java.io.InputStream in = Runtime.getRuntime().exec("hostname").getInputStream(); int a = -1; byte[] b = new byte[2048];
        String hostname = new String(in.readAllBytes());
        in.close();
        log.warning(hostname);
    }

    @RequestMapping("/exploit")
    public void vulnerable(Payload model) {
        log.info(String.format("Got model: %s", model));
    }

}
