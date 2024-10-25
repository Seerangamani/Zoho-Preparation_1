import java.util.Scanner;

public class CeilFloor {
    public static int Ceil(int[] array , int key)
    {
        int low = 0 , high =  array.length-1 , mid = 0 ;
         while( low <= high)
         {
            mid = (low + high ) / 2;
            if( key == array[mid])
            {
                return array[mid];
            }
            else if(key >= array[mid])
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1 ;
            }
         }
         if(low < array.length )
         {  
            return array[low];
         }
         else
         {
            return -1;
         }

    }
    public static int Floor(int[] array , int key)
    {
        int low = 0 , high =  array.length-1 , mid = 0 ;
        while( low <= high)
        {
           mid = (low + high ) / 2;
           if( key == array[mid])
           {
               return array[mid];
           }
           else if(key >= array[mid])
           {
               low = mid + 1;
           }
           else 
           {
               high = mid - 1 ;
           }
        }
        if(high < array.length )
        {  
           return array[high];
        }
        else
        {
           return -1;
        }
    }

    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = scan.nextInt();
        int[] array =  new int[n];
        System.out.println("values");
        for(int i = 0 ; i < n ; i++)
        {
            array[i]= scan .nextInt();
        }
        int key ;
        System.out.println("key");
        key = scan.nextInt();

        System.out.println(Ceil(array, key));
        System.out.println(Floor(array, key));

    }   
}
