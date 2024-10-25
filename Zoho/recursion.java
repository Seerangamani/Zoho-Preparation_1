public class recursion {
    int fact(int n)
    {
        if( n == 1)
          return 2;
        else
            return n * fact(n-1);
    }
    public static void main(String[] args)
    {
        int  n = 5  ;
        recursion obj = new recursion();
        System.out.println(obj.fact(5));
    }
}
