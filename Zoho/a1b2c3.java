
import java.util.Scanner;

public class a1b2c3 {
    public static void main(String[] args) {
        // int n ;
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the array size :");
        // n = scan.nextInt();
        int cnum = 0 ;
        char temp ;
        String str;
        System.out.println("Enter the string :");
        str = scan.next();
        //` 
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <='9')
            {
                if (i > 0) 
                {
                temp = str.charAt(i-1);
                // 
                while( i < str.length() && str.charAt(i) >= '0' && str.charAt(i)<='9')
                {
                    cnum = (cnum * 10) + (str.charAt(i) - 48);
                    i++;
                }
                for(int j = 0 ; j < cnum ;j++)
                {
                    System.out.print(temp);
                }
                cnum = 0 ;
                i--;
            }
        } 
    }
        
      scan.close();
    }   
}
