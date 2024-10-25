import java.util.Scanner;

public class preparation1 {
    public static void main(String[] args)
    {
        int n , k = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = scan.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            for(int s = 0 ; s < (n-i) -1 ; s++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < (i * 2) + 1 ; j++)
            {
                if(i>=j)
                {
                    System.out.print(++k);
                }
                else
                {
                    System.out.print(--k);
                }
            }
            System.out.println();
        }
    }
}
