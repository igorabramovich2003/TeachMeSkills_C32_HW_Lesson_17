package com.teachmeskills.lesson_17.task_2;

import com.teachmeskills.lesson_17.task_2.impl.MyFunctionalInterface;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
/*
Task 2
Get day of week by date
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date in DD-MM-YYYY format:");
        String inputDate = scanner.nextLine();

        MyFunctionalInterface.GenericFunction<String> getDayOfWeek = () -> {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate localDate = LocalDate.parse(inputDate, formatter);
                DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                return dayOfWeek.toString();
            } catch (DateTimeParseException e) {
                return "Invalid date format.";
            }
        };

        String dayOfWeek = getDayOfWeek.day();
        System.out.println("Day of the week: " + dayOfWeek);
    }
}

