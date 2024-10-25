import java.util.Scanner;
public class Geeks1 {
    public static void main(String[] args){
        String n ;
        int num = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String:");
        n = scan.next();
        for( int i = 0 ; i < n.length() ; i++)
        {
            if(n.charAt(i) >='0' && n.charAt(i)<='9')
            {
                char temp = n.charAt(i-1);
                while(i < n.length() && n.charAt(i)>='0' && n.charAt(i)<='9')
                {
                    num = ( num * 10) + (n.charAt(i) - 48);
                    i++;
                }
                for(int j = 0 ; j < num ; j++)
                {
                    System.out.print(temp);
                }
            }
            num = 0;
        }
    }
}
