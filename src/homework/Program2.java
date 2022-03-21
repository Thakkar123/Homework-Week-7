package homework;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Program2 {

public static void main(String[] args) {
        leapyear();  // static method can call directly inside main static method
    }

public static void leapyear() //static method
    {
        int year;  // local variable
        System.out.println("Enter the year here ");
        Scanner p = new Scanner(System.in);  // Scanner class
        year = p.nextInt(); // scanner method for taking integer input

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)  // leap year logic
        {
            System.out.println(year+" is a leap year");
        } else
        {
            System.out.println(year +" is not a leap year");
        }
    }
}


