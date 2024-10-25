import java.util.Scanner;
public class Xpattern {
    public static void main(String[] args)
    {
        int n ;
        Scanner scan =  new Scanner(System.in);
        n = scan.nextInt();
        int  temp = n ;
        for( int i = 0 ; i < n ; i++)
        {
            for( int j = 0 ; j <  n  ; j++ )
            {
               
                if( i == j)
                {
                    if(i<=n/2)
                    {
                        System.out.print( n - i );
                    }
                    else{
                        System.out.print( i + 1  );
                    }
                   
                }
                else if( i + j + 1 == n)
                {
                    if( i<= n/2)
                    {
                        System.out.print( i +1 );
                    }
                    else
                    {
                        System.out.print( j +1);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
