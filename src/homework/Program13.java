package homework;

import java.util.Scanner;

/* Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
*/
public class Program13 {
        int day;                                    // instance variable declaration
public static void main(String[] args) {            // main static method
         Program13 ob = new Program13();            // object creation
         ob.day();                                  // calling instance method via object reference inside static method
         }
public void day()                                   // instance method
        {
        System.out.println("Please input the number below:");
        Scanner p=new Scanner(System.in);           // Syntax for Scanner class
        day= p.nextInt();                           // scanner class method use for taking integer input

        switch(day)                                 // switch expression
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:                                // optional default statement
                System.out.println("Week contains 1 to 7 days");
        }
     }
 }
