// Exercise:
// Write a program to calculate percentage of a given student in CBSE board exam.
// His marks form 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class CWH_05_taking_input_exercise{
    public static void main(String[] args) {
        System.out.println("Taking marks as input:");
        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter marks of subject 1:");
        float sub1 = user_input.nextFloat();

        System.out.println("Enter marks of subject 2:");
        float sub2 = user_input.nextFloat();

        System.out.println("Enter marks of subject 3:");
        float sub3 = user_input.nextFloat();

        System.out.println("Enter marks of subject 4:");
        float sub4 = user_input.nextFloat();

        System.out.println("Enter marks of subject 5:");
        float sub5 = user_input.nextFloat();

        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) / (100*5)) * 100;
        System.out.println("Your percentage is:");
        System.out.println(percentage);
    }
}