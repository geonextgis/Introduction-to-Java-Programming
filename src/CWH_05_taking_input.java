// // Write a program to take two integers as input and prints the sum

// import java.util.Scanner;

// public class CWH_05_taking_input {
//     public static void main(String[] args) {
//         System.out.println("Taking input from the user:");
//         Scanner user_input = new Scanner(System.in);
//         System.out.println("Enter number 1: ");
//         int num1 = user_input.nextInt();
//         System.out.println("Enter number 2: ");
//         int num2 = user_input.nextInt();
//         int sum = num1 + num2;
//         System.out.println("The sum of these number is: ");
//         System.out.println(sum);
//     }
// }


// // Write a program to take two float as input and prints the sum

// import java.util.Scanner;

// public class CWH_05_taking_input{
//     public static void main(String[] args) {
//         Scanner user_input = new Scanner(System.in);
//         System.out.println("Enter number 1: ");
//         float a = user_input.nextFloat();
//         System.out.println("Enter number 2: ");
//         float b = user_input.nextFloat();
//         float sum = a + b;
//         System.out.println("The sum of these number is: ");
//         System.out.println(sum);
//     }

// }


// // Write a program to check whether a given input is integer or not

// import java.util.Scanner;

// public class CWH_05_taking_input {

//     public static void main(String[] args) {
//         System.out.println("Taking input from user: ");
//         Scanner user_input = new Scanner(System.in);
//         boolean b1 = user_input.hasNextInt();
//         System.out.println(b1);
//     }
// }


// Write a program to take string as input

import java.util.Scanner;

public class CWH_05_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking user input:");
        Scanner user_input = new Scanner(System.in);
        // String myStr = user_input.next(); // use 'next' for single word
        String myStr = user_input.nextLine();
        System.out.println(myStr);
    }
}