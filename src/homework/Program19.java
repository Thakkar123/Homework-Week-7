package homework;
//19. Write a Java program to calculate the average value of array elements.

public class Program19 {

public static void main(String[] args) {
        int n = 0;      // variable declaration and initialization
        int average;
        int[] A1 = {10, 50, 89, 56, 87, 125, 966, 1004, 7, 61, 35};  //numeric array
        for (int i=0;i< A1.length;i++)
        {
            n = n+A1[i];
        }
        average = n/ A1.length;
        System.out.println(" Average of the array is "+average);
    }
}