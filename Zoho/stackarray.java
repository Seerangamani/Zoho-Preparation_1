import java.util.Scanner;
class SA{
    int[] array ;
    SA(int[] array)
    {
        this.array = new int[array.length];
    }
    int push(int value){
        
    }
   
}
public class stackarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        n = scan.nextInt();
        int[] array = new int[n] ;
        SA obj = new SA(array);
        for(int i = 0 ; i < n ; i++)
        {
         array[i] = scan.nextInt();
        }
        for(int i = 0 ; i < n ; i++ )
        {
            int a = array[i];
            obj.push(a);
        }

    }    
}
