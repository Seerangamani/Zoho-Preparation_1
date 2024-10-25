import java.util.Scanner;
public class Geeksset2 {
    public static void main(String[] args)
    {
        int n ; 
        Scanner scan =new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++)
        {
            arr[i] = scan.nextInt();
        }
        int temp = 0 ;
        int[] result = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i +1 ; j < n ; j++ )
            {
                if(i % 2 ==0)
                {
                    if(arr[i] < arr[j])
                    {
                        temp   = arr[i] ;
                        arr[i] = arr[j] ;
                        arr[j] = temp   ;
                    }
                }
               
               else if (arr[i] > arr[j])
               {
                    temp   = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp   ;
               }
            }
        }
        for(int i = 0 ; i < n ;i++)
        {
            System.out.print(arr[i]);
        }
    }   
}
