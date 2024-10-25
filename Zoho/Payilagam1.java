
import java.util.Scanner;

public class Payilagam1 {
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            array[i] = scan.nextInt();
        }
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            if( i < n - 1 )
            {
                if( sum < array[i] + array[i+1])
                {
                    sum = array[i] + array[i+1] ;
                }   
            }
        }
        System.out.println("sum :" + sum );
    }
}
