
import java.util.Scanner;

public class RhombusPattern {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number:");
        n =scan.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
          for(int j = 0 ; j < 2 * n - i - 1 ; j ++)
          {
            if(j < n - i - 1)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
          }
            System.out.println();
        }
    }
}
