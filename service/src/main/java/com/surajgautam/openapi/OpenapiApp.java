package com.surajgautam.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = Root.class)
public class OpenapiApp {

    public static void main(String[] args) {

        SpringApplication.run(OpenapiApp.class, args);

    }

}
