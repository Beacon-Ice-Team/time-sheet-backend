package com.beaconice.contactservice;

import com.beaconice.contactservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContactServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactServiceApplication.class, args);
    }

}
