package homework;
//Write a java program that tells us that Input number is odd or even?
//        HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program1 {

public static void main(String[] args) {
      Program1 p = new Program1();  // object creation
      p.number();  // calling an instance method via object reference

      }
public void number()   // Instance method
      {
      int number;   // local variable
      System.out.println("Please input the number= ");
      Scanner a = new Scanner(System.in);  // Scanner class
      number = a.nextInt(); // scanner method
      String result = ( number % 2==0)? "Even" : "Odd"; // Ternary Operator
      System.out.println(number + " is "+result + " number"); // output line
      }
}



