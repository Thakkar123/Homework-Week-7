package homework;
//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program17 {

public static void main(String[] args) {
        sort();            // Static method call here directly inside main static method

        }
public static void sort() // static method
        {
        int [] A1 = {10,50,89,56,87,125,966,1004,7,61,35};  // Numeric array
        String [] A2 = {"Ajit","Chetan","Sonali","Chandana","Sweta","Bindi"}; //string array
        System.out.println("Original Array A1\n" + Arrays.toString(A1));
        Arrays.sort(A1);
        System.out.println("Sorted Array A1\n" + Arrays.toString(A1));
        System.out.println("Original Array A2\n" + Arrays.toString(A2));
        Arrays.sort(A2);
        System.out.println("Sorted Array A2\n" + Arrays.toString(A2));
        }
}
