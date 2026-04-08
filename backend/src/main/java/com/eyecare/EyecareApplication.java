package com.eyecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EyecareApplication {

    public static void main(String[] args) {
        SpringApplication.run(EyecareApplication.class, args);
    }
}
