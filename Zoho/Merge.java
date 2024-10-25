import java.util.*;
public class Merge {
    public static void main(String[] args)
    {
        int n1 , n2 ;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        n1 = scan.nextInt();
        System.out.println("Enter the number 2 :");
        n2 = scan.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter the array 1 elements");
        for(int  m = 0 ; m < n1 ; m++)
        {
            arr1[m] = scan.nextInt();
        }
        System.out.println("Enter the array 2 elements");
        for(int  m = 0 ; m < n2 ; m ++)
        {
            arr2[m] = scan.nextInt();
        }
        int i = 0 , j = 0 ,k = 0;
        int[] result = new int[n1+n2];
        int count = 0 ;
        while(i < n1 && j < n2 )
        {
            if(arr1[i] <arr2[j])
            {
                result[k++] = arr1[i++];
                count++;
            }
            else if(arr1[i] == arr2[j] )
            {
                result[k++] = arr1[i++];
                j++;
                count++;
            }
            else
            {
                result[k++] = arr2[j++];
                count++;
            }
        }
        while(i < n1)
        {
            result[k++] = arr1[i++];
            count++;
        }
        while(j < n2)
        {
            result[k++] = arr2[j++];
            count++;
        }

        for(int l = 0 ; l < count;l++)
        {
            System.out.print(result[l]);
        }
        
     
    }
}
