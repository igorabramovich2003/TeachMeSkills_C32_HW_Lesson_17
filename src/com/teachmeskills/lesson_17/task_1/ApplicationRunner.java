package com.teachmeskills.lesson_17.task_1;


import com.teachmeskills.lesson_17.task_1.operation.Operation;
/*
Task 1
Create an extended functional interface.
Write a class with one method.
In this method, implement the logic:
- if the number 1 is entered in the console, then: use the interface with a string type and pass the logic of reversing the string (outputting the string in reverse order) to the interface method.

- if the number 2 is entered in the console, then: use the interface with an integer type and pass the logic of finding the factorial of the number to the interface method.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        Operation.Input();
    }
}
