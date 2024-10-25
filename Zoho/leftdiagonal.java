import java.util.Scanner;

public class leftdiagonal {
        /**
         * @param args
         */
        public static void main(String[] args) {
            int row , column ;
            Scanner scan = new Scanner(System.in);
            //number of rows
            System.out.println("Enter the number of row you want :");
            row = scan.nextInt();
            //number of columns
            System.out.println("Enter the number of column you want :");
            column = scan.nextInt();
            System.out.println("Enter the number you want as  column wise: ");
            int[][] array =  new int[row][column] ;
            //array input 
            for(int i = 0 ; i < row ; i++)
            {
                for(int j = 0 ; j < column ; j++)
                {
                    array[i][j] = scan.nextInt();
                }
            }
            int sum = 0 ;
            for(int i = 0 ; i < row ; i++ )
            {
                for(int j = 0 ; j < column ; j++)
                {
                    if(i == j)
                    {
                        sum = sum + array[i][j]; 
                    }
                }
            }
            System.out.println(sum);
           
        }
}
