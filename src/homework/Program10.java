package homework;
//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol(using if else)

import java.util.Scanner;

public class Program10 {
        static int a, b, p;     // static variable declaration
        static char op;         // static variable declaration

public static void main(String[] args) {        // main static method
        digits();               // static method can call inside main static method directly
        }
public static void digits()
        {
        System.out.println("Enter any two numbers : ");
        Scanner s = new Scanner(System.in);     // Scanner class
        a = s.nextInt();                        // scanner method for taking integer input
        b = s.nextInt();                        // scanner method for taking integer input
        System.out.println("Enter your choice:");
        op = s.next().charAt(0);                // scanner method for taking character input

        // Arithmetic Operators: +,-,/,*

        if(op=='+')
        {
            p=a+b;
            System.out.println("Addition of two number is= "+p);
        }
        else if(op=='-')
        {
            p=a-b;
            System.out.println("Subtraction of two number is= "+p);
        }
        else if(op=='/')
        {
            p=a/b;
            System.out.println("Division of two number is= "+p);
        }
        else if(op=='*')
        {
            p=a*b;
            System.out.println("Multiplication of two number is= "+p);
        }
        else
        {
            System.out.println("Please input correct choice");
        }
    }
}
