import java.util.Scanner;
public class Stringrec {
        public String rec(String str)
        {
            if( str == null || str.length()<=1)
            {
                return str ;
            }
            else
            {
                return rec(str.substring(1))  + str.charAt(0) ;
            }
        }
    public static void main(String[] args)
    {
       String str ;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the String:");
       str = scan.next();
       Stringrec obj = new Stringrec();
       System.out.println("Reverse the string :" + obj.rec(str));
    }
}
