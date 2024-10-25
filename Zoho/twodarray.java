
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c= scan.nextInt();
        int[][] array = new int[r][c];
        boolean[] rarr = new boolean[r];
        boolean[] carr = new boolean[c];
       
        //

        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                array[i][j] = scan.nextInt();
            }
        }
        int b ;
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
              if(array[i][j] == 0)
                {
                    rarr[i] = true ;
                    carr[j] = true ;
                }
            }
           
        }
        //
        
        for(int i = 0 ; i < r ; i++)
        {
            if(rarr[i])
            {
                for(int j = 0 ; j < c ; j++)
                {
                    array[i][j] = 0 ;
                }
            }
        }
        //
        for(int i = 0 ; i < r ; i++)
        {
            if(carr[i])
            {
                for(int j = 0 ; j < c ; j++)
                {
                    array[j][i] = 0 ;
                }
            }
        }
        //
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
