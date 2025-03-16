package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;


@SpringBootApplication
public class Greeter implements CommandLineRunner {
    public static void main(String[] args){

        SpringApplication.run(Greeter.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        System.out.print("When does your course start (yyyy-mm-dd) ? : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String startDateInput = reader.readLine();
        System.out.println("Start date :  " + startDateInput);

        StartDateHandler startDateHandler = new StartDateHandler();
        if(startDateHandler.dateHasOnlyNumbers(startDateInput) ){
            System.out.print("You start in " + startDateHandler.daysToCourseStart(startDateInput) + " days. Better get cracking on that Pre-course!!");
        } else {
            System.out.print("Please provide a valid date");
        }
    }
}