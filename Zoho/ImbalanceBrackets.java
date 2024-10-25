
import java.util.Scanner;
import java.util.Stack;

public class ImbalanceBrackets {
  
    public static boolean remove(String ques)
    {
        Stack<Character> st = new Stack<Character>();
        char s;
        for(int i = 0 ; i < ques.length(); i++)
        {
             s = ques.charAt(i);
            if( s == '(' || s == '{' || s == '[')
            {
                st.push(s);
                continue;
            }
            if(st.isEmpty())
            {
                return false;
            }
            switch (s) {
                case ')':
                {
                    if(!st.peek().equals('('))
                    {
                        return false;
                    }
                        st.pop();
                    break;
                }
                case '}':
                {
                    if(!st.peek().equals('{'))
                    {
                        return false;
                    }
                        st.pop();
                    break;
                }
                case ']':
                {
                    if(!st.peek().equals('['))
                    {
                        return false;
                    }
                        st.pop();
                    break;
                }
                
                    
         }
          
        }
        
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String ques ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        ques = scan.next();
         if(remove(ques))
         {
            System.out.println("Balanced");
         }
         else
         {
            System.out.println("imbalanced");
         }
    }   
}
