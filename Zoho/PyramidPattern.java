import java.util.Scanner;


public class PyramidPattern {
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number:");
        n =scan.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n + i ; j ++)
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

