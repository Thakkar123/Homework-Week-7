package homework;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use switch case)
if any other alphabet should be invalid entry */

public class Program9 {
         String alphabet;               // Instance variable
public static void main(String[] args) {
         Program9 j = new Program9();   // object creation
         j.cityname();                  // calling instance method via object reference
         }
public void cityname()                  // instance method
        {
        System.out.println("Enter the alphabet");
        Scanner a = new Scanner(System.in); //scanner class
        alphabet = a.nextLine();            // scanner method for taking string input

        switch (alphabet) {
            case "A":
                if (alphabet.equals("A")) {
                    System.out.println("City name is Ahmedabad");
                    break;
                }
            case "B":
                if (alphabet.equals("B")) {
                    System.out.println("City name is Banglore");
                    break;
                }
            case "C":
                if (alphabet.equals("C")) {
                    System.out.println("City name is Chennai");
                    break;
                }
            case "D":
                if (alphabet.equals("D")) {
                    System.out.println("City name is Delhi");
                    break;
                }
            case "E":
                if (alphabet.equals("E")) {
                    System.out.println("City name is Erode");
                    break;
                }
            case "F":
                if (alphabet.equals("F")) {
                    System.out.println("City name is Faridabad");
                    break;
                }
            default:
                System.out.println("Invalid entry");
        }
    }
}