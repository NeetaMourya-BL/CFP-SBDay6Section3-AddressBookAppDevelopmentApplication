package com.bridgelabz.addressbookappdevelopment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication

public class AddressBookAppDevelopmentApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Spring Address Book App Development");
        SpringApplication.run(AddressBookAppDevelopmentApplication.class, args);
        log.info("Employee Payroll App started");
    }

}
