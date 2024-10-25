import java.util.Scanner;
class Main{
   
    String Remove(String str1){
        String str2 = "";
        int count = 0 ;
        for(int i = 0 ; i < str1.length() ; i++)
        {
            
            if(str1.charAt(i) == 'a' ||str1.charAt(i) == 'e'|| str1.charAt(i) ==  'i' ||str1.charAt(i) ==  'o' ||str1.charAt(i) ==  'u' )   
            {
               if(str1.charAt(i) == str1.charAt(i+1) )
               {
                str2 += str1.charAt(i);
                str2 += str1.charAt(i+1);
               }
               else{
                 continue;
               }
            }
            else{
               str2+=str1.charAt(i);
            }
        }
        return str2;
    }
}

public class removevowel {
    public static void main(String[] args) {
        String str1 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        str1 = scan.nextLine();
        Main obj = new Main();
        String result =  obj.Remove(str1);
        System.out.println(result);

    }
    
}