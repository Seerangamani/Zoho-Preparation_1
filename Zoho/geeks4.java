import java.util.Scanner;
public class geeks4 {
    public static void main(String[] args)
    {
        int count = 0 , index = -1;
        String str1 ;
        String str2 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the main Stringg:");
        str1 = scan.next();
        System.out.println("Enter the Sub String:");
        str2 = scan.next();
        for(int i = 0 ; i < str1.length(); i++)
        {
           
            for(int j = 0 ; j < str2.length() ; j++)
            {
                int s = i ;
                if( i < str1.length() && str1.charAt(i) == str2.charAt(j))
                {
                    count ++ ;   
                    i++;
                    if(count == str2.length())
                    {
                        index = s - count +1 ;
                    }
                  
                }
                else
                {
                    count = 0;
                }
               
            }
        }
        System.out.println("Index : " + index );
    }
}
