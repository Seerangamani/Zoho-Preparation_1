import java.util.Scanner;
class Stackim{
    boolean operat(String str)
    {
        int k = 0 ,count = 0 ;
        char[] carray = new char[3];
        for(int i = 0 ; i < str.length() ; i++ )
        {
            char c = str.charAt(i);
            if( c == '{' || c == '(' || c == '[')
            {
                carray[ count ++ ] = c ;
               
                continue;
            }
            else if( c != '{' || c != '(' || c != '[')
            {
                if(count == 0)
                {
                    return false ;
                }
            }
            char top = carray[--count]; // Pop the top element from stack
                
            if ((c == '}' && top != '{') ||
                (c == ')' && top != '(') ||
                (c == ']' && top != '[')) {
                return false; // Mismatched bracket
            }
           
        }
        return count == 0;
    }
}

public class Bracket2 {
    public static void main(String[] args) {
        String str ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = scan.nextLine();
        Stackim obj = new Stackim();
        boolean bool = obj.operat(str);
       if(bool)
       {
        System.out.println(1);
       }
       else
       System.out.println(0);

    }    
}
