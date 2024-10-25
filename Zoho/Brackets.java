import java.util.Scanner;
// create the new class 
class Stackimp{
    // create a new method for stack operation
    boolean operation(String str){
         Stack<Character> stack = new Stack<>();
         for( int i = 0 ;i < str.length() ; i++ )
         {
            char ch = str.charAt(i);
            if( ch == '[' || ch == '{' || ch == '(' )
            {
                stack.push(ch);
                continue;
            }
            if( ch != '[' || ch != '{' || ch != '(' )
            {
                continue;
            }
            if (stack.isEmpty()) 
            {
                return false;
            }
               
            char top = stack.peek(); 
             switch (ch) {
               
                case ')':
                    if( top != '(')
                        return false;
                    else
                        stack.pop();
                    break;
                case '}':
                    if( top != '{')
                        return false;
                    else
                        stack.pop();
                    break;
                case ']':
                    if( top != '[')
                        return false;
                    else
                        stack.pop();
                    break;
                default:
                    break;
            }
         }
         return stack.isEmpty(); 
    }
}

public class Brackets {

    public static void main(String[] args) {
        String str ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = scan.nextLine();
        Stackimp obj = new Stackimp();
        if( obj.operation(str))
            System.out.println(1);
        else
            system.out.println(0);

    }
}