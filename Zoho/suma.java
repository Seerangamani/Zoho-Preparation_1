
import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        int n ,target  ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size :");
        n = scan.nextInt() ;
        int[] array = new int[n];
        for ( int i = 0 ; i < n ; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the target number:");
        target = scan. nextInt();
       
        int left = 0 ;
        int right = n - 1 ;
        int ans = 0;
        int middle = left + ( right - left) /2;
        while (left <= right)
        {
            if( array[middle] == target)
            {
                ans = middle ;
                break ;
            }
            else if(array[middle] < target)
            {
                left = middle + 1 ;
                middle  = left;
                if(array[left] == target)
                {
                    ans = left ;
                    break;
                }
            }
            else if( array[middle] > target )
            {
                right = middle - 1 ;
                middle  = right;
                if(array[right] == target)
                {
                    ans = right ;
                    break;
                }
            }
            else
            {
                System.out.println("not present") ;
            }
            // middle = left + (left - right); 
        }
        System.out.println("answer: "+ans);

    }
}
