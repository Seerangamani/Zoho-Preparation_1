
import java.util.Scanner;

public class IntegertoRoman
{
     public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        // Map<Integer,String> map = new HashMap<>();
        // // ------------------------------------//
        // map.put(1, "I");
        // map.put(4, "IV");
        // map.put(5, "V");
        // map.put(9, "IX");
        // map.put(10, "X");
        // map.put(40, "XL");
        // map.put(50, "L");
        // map.put(90, "XC");
        // map.put(100, "C");
        // map.put(400,"CD");
        // map.put(500, "D");
        // map.put(900, "CM");
        // map.put(1000, "M");
        String[] str = {"M" , " CM " ,"D" , "CD" , "C" , "XC" ,"L" ,"XL" ,"X" ,"IX" ,"V" ,"IV" , "I"};

        int[] array = {1000 ,900 ,500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String result = "";
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        for(int i = 0 ; n > 0; i++)
        {
            if(n >= array[i])
            {
                int q = n / array[i];
                n = n % array[i];
                for(int j = 0 ; j < q ; j++)
                {
                    result = result + str[i];
                }
            }
        }
        System.out.println("Roman Numeral = " + result);



     }
}