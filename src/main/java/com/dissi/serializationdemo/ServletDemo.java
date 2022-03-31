package com.dissi.serializationdemo;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServletDemo extends SpringBootServletInitializer {

    private static final Logger log = Logger.getLogger(ServletDemo.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ServletDemo.class, args);
    }

    @RequestMapping("/exploit")
    public String vulnerable(Message model) {
        log.info(String.format("Got model: %s", model));
        return model.toString();
    }

}
