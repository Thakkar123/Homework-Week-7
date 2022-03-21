package homework;
// Write a java program to print the numbers between 1 to 100 which can be divided by 3and 5 separately.

public class Program11 {

public static void main(String[] args){             // main static method
        three();             // static method1 can call inside main static method directly
        five();              // static method2 can call inside main static method directly
        }

public static void three()  // static method 1
        {
        System.out.println("\nDivided by 3: "); // \n(newline character)- insert a new line at this specific point in the text.
        for (int i = 1; i <= 100; i++) {        // for loop(initialization,Condition,Increment)
            if (i % 3 == 0)
            System.out.print(i + ", ");
        }
        }
public static void five() // static method 2
        {
        System.out.println("\nDivided by 5: "); // \n(newline character)- insert a new line at this specific point in the text.
        for (int p = 1; p <= 100; p++) {        // for loop(initialization,Condition,Increment)
            if (p % 5 == 0)
            System.out.print(p + ", ");
        }
    }
}

