package com.example.examplealarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExampleAlarmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleAlarmApplication.class, args);
    }

}
