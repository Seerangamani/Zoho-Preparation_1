
import java.util.Scanner;

public class summaa
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String input;
    System.out.println("Enter the String:");
    input = scan.next();
    System.out.println("Enter the character to remove");
    char ch=scan.next().charAt(0);
    int n =input.length();
    String result="";
    for(int i = 0 ; i < n; i++)
    {
      if(input.charAt(i)==ch)
      {
        result+=" ";
      }
      else
      {
        result+=input.charAt(i);
      }
    } 
    for(int i = 0 ; i < n ;i++)
    {
      if(result.charAt(i)!=' ')
      {
        System.out.print(result.charAt(i));
      }
    }

    }


  }

