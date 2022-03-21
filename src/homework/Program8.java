package homework;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
if any other alphabet should be invalid entry */

public class Program8 {

public static void main(String[] args){  // main method
        city();                          //static method can call inside main static method directly
        }
public static void city() // static method
        {
        String alphabet;  // local variable
        System.out.println("Enter the alphabet from A to F");
        Scanner a = new Scanner(System.in); // scanner class
        alphabet = a.nextLine();            // scanner method for taking string input
        if (alphabet.equals("A")||(alphabet.equals("a"))){
            System.out.println("City name is Ahmedabad");
        }
        else if(alphabet.equals("B")||(alphabet.equals("b"))){
            System.out.println("City name is Bangalore");
        }
        else if(alphabet.equals("C")||(alphabet.equals("c"))){
            System.out.println("City name is Chennai");
        }
        else if(alphabet.equals("D")||(alphabet.equals("d"))){
            System.out.println("City name is Delhi");
        }
        else if(alphabet.equals("E")||(alphabet.equals("e"))){
            System.out.println("City name is Erode");
        }
        else if(alphabet.equals("F")||(alphabet.equals("f"))){
            System.out.println("City name is Faridabad");
        }
        else{
            System.out.println("Invalid entry");
        }
    }
}
