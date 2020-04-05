package com.beaconice.timesheetservice;

import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;
import java.util.List;

@SpringBootApplication
public class TimesheetServiceApplication {

    public static void main(String[] args) throws UnknownHostException {

        SpringApplication.run(TimesheetServiceApplication.class, args);
    }

}
