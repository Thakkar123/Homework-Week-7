package homework;

import java.util.Scanner;

//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or "ZERO”

public class Program16{
        static int n;                                       // Static variable declaration
public static void main(String[] args) {                    // main static method
        Program16 t = new Program16();                      // object creation
        t.type();                                           // calling instance method via object reference inside static method
        }
public void type()                                          // Instance method
        {
        System.out.println("Please enter the numbers only");
        Scanner s = new Scanner(System.in);                 // Syntax for scanner class
        Program16.n = s.nextInt();                          // use the class name approach to call static variable n inside instance method
        if (n > 0) {
            System.out.println(n + " is positive number");
        } else if (n < 0) {
            System.out.println(n + " is negative number");
        } else if (n == 0) {
            System.out.println("This is zero");
        }
        else System.out.println("numbers only");
    }
}