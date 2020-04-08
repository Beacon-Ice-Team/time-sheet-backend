package com.beaconice.timesheetservice;

import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.net.UnknownHostException;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class TimesheetServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(TimesheetServiceApplication.class, args);
    }

}
