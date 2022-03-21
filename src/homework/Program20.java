package homework;

//20. Write a Java program to test if an array contains a specific value

public class Program20 {

public static void main(String[] args) {
        int[] A1 = {10, 50, 89, 56, 87, 125, 966, 1004, 7, 61, 35};
        int i = 960;            // variable declaration and initialization
        boolean found = false;  // variable declaration and initialization

        for (int n : A1) {
            if (n == i) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(i + " is found in array.");
        else
            System.out.println(i + " is not found in array.");
    }
}


