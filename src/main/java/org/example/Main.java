package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {



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