package homework;
// 18. Write a Java program to sum values of an array.
public class Program18 {

public static void main(String[] args) {
        int n=0;        // variable declaration and initialization
        int [] A1 = {10,50,89,56,87,125,966,1004,7,61,35};   //numeric array
        for(int i:A1)
        {
            n=n+i;
        }
        System.out.println(" Sum of Arrays is: "+n);
    }
}
