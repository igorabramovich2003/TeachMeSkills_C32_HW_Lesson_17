package com.teachmeskills.lesson_17.task_1.operation;

import com.teachmeskills.lesson_17.task_1.impl.MyFunctionalInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
    public static void Input() {
        try (Scanner sc = new Scanner(System.in)) {
            int choice = Integer.parseInt(sc.nextLine());
            if (choice <= 0 || choice >= 3) {
                throw new IllegalArgumentException("Invalid number entered.");
            }
            if (choice == 1) {
                MyFunctionalInterface<String> reversString = (input) -> new StringBuilder(input).reverse().toString();
                String inputString = sc.nextLine();
                String reversedString = reversString.fuc(inputString);
                System.out.println(reversedString);
            } else {
                MyFunctionalInterface<Integer> factorial = (input) -> {
                    if (input < 0) {
                        throw new IllegalArgumentException();
                    }
                    int result = 1;
                    for (int i = 2; i <= input; i++) {
                        result *= i;
                    }
                    return result;
                };
                int inputNum = Integer.parseInt(sc.nextLine());
                Integer factorialResult = factorial.fuc(inputNum);
                System.out.println(factorialResult);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
