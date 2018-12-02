package com.seregy77.msdt.kafka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SecondProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondProducerApplication.class, args);
    }
}
