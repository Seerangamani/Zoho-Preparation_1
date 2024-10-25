
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomantoInteger {
    public static void main(String[] args) {
        String s ;
        Scanner scan = new Scanner(System.in);
        s = scan.next();
        Map<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X',10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M', 1000);
        int ans = 0 ;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            
            if( i+1  < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
            {
                ans = ans + map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }
            else
            {
                ans = ans + map.get(c);
            }
        }
        System.out.println(ans);
    }
}