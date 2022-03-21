package homework;

//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program12 {
        char A;                             // Instance variable declaration
public static void main(String[] args) {
        Program12 object = new Program12(); // object creation
        object.inputvalue();                // calling instance method via object reference
        }
public void inputvalue()                    // Instance method
        {
        System.out.println("Please input any character: ");
        Scanner s = new Scanner(System.in); // Scanner class
        A=s.next().charAt(0);               // scanner method for taking character input
        if( (A >= 'a' && A <= 'z') || (A >= 'A' && A <= 'Z') )
        {
            System.out.println(A+" This is alphabet");
        }
        else if (A >= '0' && A <= '9')
        {
            System.out.println(A+" This is number");
        }
        else
        {
            System.out.println(A + " This is symbol");
        }
        }
}
