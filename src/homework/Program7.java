package homework;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then find this sales Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/

import java.util.Scanner;

public class Program7 {
            // instance variable declaration
            int salesID;
            String SellerName;
            int amount;
            double salarybasic;
            double salesCommission;

public static void main(String[] args) {    // main static method
            Program7 obj = new Program7();  // Object creation
            obj.salesdetails();             // calling instance method via object reference
            obj.commission();               // calling instance method via object reference
    }
public void salesdetails()   // Instance method 1
            {
            System.out.println("Enter sales id");
            Scanner a = new Scanner(System.in); // scanner class
            salesID = a.nextInt();              // scanner method for taking integer input
            System.out.println("Enter seller name");
            Scanner b = new Scanner(System.in); // scanner class
            SellerName = b.nextLine();          // scanner method for taking integer input
            System.out.println("Enter sales amount");
            Scanner c = new Scanner(System.in); // scanner class
            amount = c.nextInt();               // scanner method for taking integer input
            }
public void commission()    // Instance method 2
            {
            if(amount>=50000)  // if statement to calculate the commission
            {
                salesCommission = amount * 0.35;
                System.out.println("Sales commission is = "+salesCommission);
            }
            else if(amount>=30000)
            {
                salesCommission = amount * 0.20;
                System.out.println("Sales commission is = "+salesCommission);
            }
            else if(amount>=20000)
            {
                salesCommission =amount*0.10;
                System.out.println("Sales commission is = "+salesCommission);
            }
            else if(amount>=10000)
            {
                salesCommission = amount*0.05;
                System.out.println("Sales commission is = "+salesCommission);
            }
            else if(amount<10000)
            {
                salesCommission = amount * 0.02;
                System.out.println(salesCommission);
            }
            else
            {
                System.out.println("please input valid value");
            }
            }
}
