import java.util.Scanner;
public class preparation4 {
    public static void main(String[] args)
    {
        int n ,answer = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = scan.nextInt();
        System.out.println("Enter the array elements:");
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            array[i] = scan.nextInt(); 
        }
        int max = 0 , min = 0;
        for(int i = 0 ; i < n ; i++)
        {
            min = array[i];
            if(max<array[i])
                max = array[i];
            else if(min> array[i])
                min = array[i];
        }
        int sum = 0  , total = 0 ;
        for(int i = min ; i <= max ; i = i +2)
        {
            sum = sum + i ;
        }
        for(int i = 0 ; i < n ; i++)
        {
            total = total + array [i];
        }
        int sub = 0 ;
        sub = sum - total ;
        System.out.println(sub);
    }
}
