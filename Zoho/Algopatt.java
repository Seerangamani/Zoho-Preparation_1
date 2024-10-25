
import java.util.Scanner;

public class Algopatt {
    public static void main(String[] args) {
        int n , a , b = 1 ;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            a = i ;
            for(int s = 0 ;s < n - i - 1 ; s++)
            {
                System.out.print(" ");
            }
            for (int j = 0 ; j < (i * 2) + 1 ; j++)
            {
                if( i >= j)
                {
                    System.out.print(a);
                    a--;
                }
                else
                {
                    
                    System.out.print(b++);
                }
            }
            System.out.println("");
            b = 1;
        }
    }   
}
