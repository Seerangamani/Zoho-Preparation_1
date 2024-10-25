
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args)
    {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number:");
        n = scan.nextInt();
        int[] array  = new int[n];
        System.out.println("Enter The Values :");
        for(int i = 0 ; i < n ; i++)
        {
            array[i] = scan.nextInt();
        }
        int sliding ;
        System.out.println("Enter The Number : for sliding window");
        sliding = scan.nextInt();
        int ln , max = 0 , sum = 0 , rev , revadd = 0;
        int[] result = new int[5];
        int k = 0 ;
        for( int i = 0 ; i < n ; i++ )
        {
            if(i> 0)

            for( int j = i ; j < i + sliding ; j++ )
            {
                ln = array[j] % 10 ;
                if( ln > max)
                {
                    max = ln ;
                    array[j] = array[j] / 10 ;
                }   

            }
            if(array[i] > 0)
            {
                sum = sum * 10 + max ;
                max = 0 ;
            }
            else
            {
                while( sum > 0)
                {
                    rev = sum % 10 ;
                    sum = sum /10 ;
                    revadd = revadd * 10 + rev ;
                }
                result[k++] = revadd;
            }
            sum = 0;
        }
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(result[i]);
        }

    }
}
