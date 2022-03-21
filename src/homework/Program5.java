package homework;
/*
double hra, ta, da, pf, grossalary;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee Id: ");
        int empid = scan.nextInt();

        System.out.print("Enter Employee Name: ");
        String empname = scan.next();

        System.out.print("Enter Employee Salary: ");
        double basicsalary = scan.nextDouble();

        hra = (basicsalary * 10) / 100;
        ta = (basicsalary * 8) / 100;
        da = (basicsalary * 9) / 100;
        pf = (basicsalary * 20) / 100;

        grossalary = ((basicsalary + hra + ta + da) - (pf));

        System.out.println("|----------------------------------|");
        System.out.println("|           Salary Slip            |");
        System.out.println("|----------------------------------|");
        System.out.println("| Employee Id   : " + empid + "              |");
        System.out.println("| Employee Name : " + empname + "               |");
        System.out.println("|----------------------------------|");
        System.out.println("| Basic Salary  : " + basicsalary + "          |");
        System.out.println("| HRA   10%     : " + hra + "            |");
        System.out.println("| TA     8%     : " + ta + "             |");
        System.out.println("| DA     9%     : " + da + "             |");
        System.out.println("| PF    -20%    : " + pf + "             |");
        System.out.println("|----------------------------------|");
        System.out.println("| Gross Salary  : " + grossalary + "          |");
        System.out.println("|__________________________________|");

    }
}
 */

import java.util.Scanner;

public class Program5 {
        // variables declaration
        double HRA;
        double TA;
        double DA;
        double PF;
        double GrossSalary;
        double basicsalary;
        int empid;
        String empname;

public static void main(String[] args) {        // Main method
        Program5 p = new Program5();            // Object creation
        p.employee();                           // Calling instance method 1 via object reference
        p.calculation();                        // Calling instance method 2 via object reference
        p.print();                              // Calling instance method 3 via object reference
}
public void employee()  // Instance method 1
        {
        System.out.print("Enter employee Id: ");
        Scanner scan = new Scanner(System.in);  // Scanner class
        empid = scan.nextInt(); // scanner method for taking runtime integer input

        System.out.print("Enter Employee Name: ");
        empname = scan.next();  // scanner method for taking runtime string input

        System.out.print("Enter Employee Salary: ");
        basicsalary = scan.nextDouble();  // scanner method for taking runtime double type input
        }
public void calculation()  // Instance method 2
        {
        HRA = (basicsalary * 10) / 100;
        TA = (basicsalary * 8) / 100;
        DA = (basicsalary * 9) / 100;
        PF = (basicsalary * 20) / 100;
        GrossSalary = ((basicsalary + HRA + TA + DA) - (PF));   // gross salary calculation logic
        }
public void print()  // Instance method 3
        {
        System.out.println("|----------------------------------|");
        System.out.println("|           Salary Slip            |");
        System.out.println("|----------------------------------|");
        System.out.println("| Employee Id   : " + empid + "             |");
        System.out.println("| Employee Name : " + empname + "             |");
        System.out.println("|----------------------------------|");
        System.out.println("| Basic Salary  : " + basicsalary + "          |");
        System.out.println("| HRA   10%     : " + HRA + "           |");
        System.out.println("| TA     8%     : " + TA + "          |");
        System.out.println("| DA     9%     : " + DA + "          |");
        System.out.println("| PF    -20%&   : " + PF + "          |");
        System.out.println("|----------------------------------|");
        System.out.println("| Gross Salary  : " + GrossSalary + "         |");
        System.out.println("|__________________________________|");

        }
}

