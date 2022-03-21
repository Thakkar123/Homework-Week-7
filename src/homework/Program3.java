package homework;

import java.util.Scanner;

/*    Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        _______________________________
        | |
        | Mark Sheet |
        |_______________________________|
        | Name : Jay |
        | Roll No: 08 |
        |_______________________________|
        | Subjects : Marks |
        |_______________________________|
        | Math : 98 |
        | Science : 90 |
        | English : 85 |
        |_______________________________|
        | Total : 273 |
        |_______________________________|
        | Percentage : 91.0 |
        | Result : Pass |
        | Grade : A+ |
        |_______________________________|
*/

public class Program3 {
        // Variables declarations
        String name;
        int roll;
        int math;
        int science;
        int english;
        int total;
        String result = null;
        String grade = null;
        float percentage;

public static void main(String[] args) {    //main method
        Program3 p = new Program3();        // object creation
        p.studentdetais();                  // calling method1 studentdetails via object reference
        p.calculation();                    // calling method2 calculation via object reference
        p.logic();                          // calling method3 logic via object reference
        p.marksheet();                      // calling method4 marksheet via object reference
    }

public void studentdetais()   // Instance method 1--studentdetails
    {
        System.out.println("Enter Student name");
        Scanner a = new Scanner(System.in); // scanner class
        name = a.nextLine();                // scanner method for taking integer input
        System.out.println("Enter roll number");
        Scanner b = new Scanner(System.in); // scanner class
        roll = b.nextInt();                 // scanner method for taking integer input
        System.out.println("Enter marks for maths");
        Scanner c = new Scanner(System.in); // scanner class
        math = c.nextInt();                 // scanner method for taking integer input
        System.out.println("Enter marks for science");
        Scanner d = new Scanner(System.in); // scanner class
        science = d.nextInt();              // scanner method for taking integer input
        System.out.println("Enter marks for english");
        Scanner e = new Scanner(System.in); // scanner class
        english = e.nextInt();              // scanner method for taking integer input
    }

public void calculation()  // Instance method 2 calculation
    {
        total = math + science + english;     // total of all three subjects
        percentage = ((total * 100) / 300);   // percentage calculation
    }

public void logic()     // Instance method 3 logic
    {
        if (percentage >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade: " + grade);
        } else {
            grade = "No grade";
        }
    }

public void marksheet()    // Instance method 4 marksheet
    {
        System.out.println("-------------------------------------");
        System.out.println("|-----------------------------------|");
        System.out.println("|            Mark Sheet             |  ");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Name         :      " + name + "         |");
        System.out.println("|  Roll No:              " + roll + "          |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Subjects   :     Marks           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Maths:           " + math + "              |");
        System.out.println("|  Science:         " + science + "              |");
        System.out.println("|  English:        " + english + "               |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Total:      :    " + total + "             |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Percentage:    " + percentage + "              |");
        System.out.println("|  Result:         " + result + "             |");
        System.out.println("|  Grade:          " + grade + "               |");
        System.out.println("|-----------------------------------|");
    }
}