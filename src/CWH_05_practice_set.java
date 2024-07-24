// // Question 1
// // Write a program to sum three numbers in java

// import java.util.Scanner;

// public class CWH_05_practice_set {
//     public static void main(String[] args) {
//         System.out.println("Taking user input:");
//         Scanner user_input = new Scanner(System.in);

//         System.out.println("Enter number 1:");
//         float num1 = user_input.nextFloat();

//         System.out.println("Enter number 2:");
//         float num2 = user_input.nextFloat();

//         System.out.println("Enter number 3:");
//         float num3 = user_input.nextFloat();

//         float sum = num1 + num2 + num3;
//         System.out.println("The sum of these three number is:");
//         System.out.println(sum);
//     }
// }


// // Question 2
// // Write a program to calculate CGPA using marks of three subjects (out of 100)

// import java.util.Scanner;

// public class CWH_05_practice_set{
//     public static void main(String[] args) {
//         System.out.println("Taking user input:");
//         Scanner user_input = new Scanner(System.in);

//         System.out.println("Enter the marks of subject 1:");
//         float sub1 = user_input.nextFloat();

//         System.out.println("Enter the marks of subject 2:");
//         float sub2 = user_input.nextFloat();

//         System.out.println("Enter the marks of subject 3:");
//         float sub3 = user_input.nextFloat();

//         // Calculate CGPA
//         float cgpa = (((sub1 + sub2 + sub3) / (100 * 3)) * 100) / 10;
//         System.out.println("Your CGPA is:");
//         System.out.println(cgpa);
//     }
// }


// // Question 3
// // Write a java program which asks the user to enters his/her name and greets them with
// // "Hello <name>, have a good day!" text.

import java.util.Scanner;

public class CWH_05_practice_set {
    public static void main(String[] args) {
        System.out.println("Taking user input:");
        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String user_str = user_input.nextLine();

        System.out.println("Hello " + user_str + ", have a good day!");
    }
}
