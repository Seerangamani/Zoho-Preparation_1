// import java.util.Scanner;
import java.util.*;
public class Geeks5 {
    
    public static void main(String[] args)
    {
        int n1  , n2 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for an array 1:");
        n1 = scan.nextInt() ;
        System.out.println("Enter the number for an array 2:");
        n2 = scan.nextInt() ;
        int[] array1 = new int[n1] ;
        int[] array2 = new int[n2] ;
        System.out.println("Enter the array 1 values:");
        for( int i = 0 ; i < n1 ; i++ )
        {
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter the array 2 values:");
        for( int i = 0 ; i < n2 ; i++ )
        {
            array2[i] = scan.nextInt();
        }
        Set<Integer> merge = new HashSet<Integer>();
        for(int num : array1)
            merge.add(num);
        for(int num : array2)
            merge.add(num);
        System.out.println(merge);
      

    }
}
