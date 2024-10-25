import java.util.Scanner;
import java.lang.String;
public class preparation2 {
    public static void main(String[] args)
    {
        String str ;
        String result ="" ;
        int count = 1 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = scan.next();
        for(int i = 0 ; i < str.length() ;i++)
        {
          if( i+1 < str.length() && str.charAt(i)== str.charAt(i+1))
          {
            count++;
          }
          else{
            if(count>1)
           
           result = result +  str.charAt(i) +String.valueOf(count);
           else
           result = result +  str.charAt(i) ;
            
           count = 1;
          }
        }
        System.out.println("Answer:" + result);

    }   
}
