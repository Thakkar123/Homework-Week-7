package homework;
// Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6 {

       static int number;  // static variable

public static void main(String[] args) {
        number();  // Static method can be call directly inside main static method
}
        public static void number()  // static method
        {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);  // Scanner class
        number = s.nextInt();  // scanner method for taking integer input
        if (number % 2 == 0)   // Arithmetic operator %
        {
            System.out.println(number +" is even number");
        }else
        {
            System.out.println(number+ " is odd number");
        }
    }
}
