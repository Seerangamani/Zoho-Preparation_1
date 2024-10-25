
import java.util.Scanner;

public class Payilagam2 {
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = scan.nextInt() ;
        System.out.println("Enter the Gap :");
        int gap = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array elements :");
        for(int i = 0 ; i < n ; i++)
        {
            array[i] = scan.nextInt();
        }
        int sum = 0 ;
        for(int i = 0 ; i < n ; i= i + gap)
        {
            sum = sum + array[i];
        }
        System.out.println("sum :" + sum);
    }
}
