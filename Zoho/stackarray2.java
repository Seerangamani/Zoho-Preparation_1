class stack{
    int[] array = new int[4];
    int top = -1 ;
    void push(int value)
    {
        if(top < 4 )
        array[++top] = value ;
    }
    int pop()
    {
        int t = array[top] ;
        top-- ;
        return t;
    }
    int peek()
    {
        int temp = array[top-1];
        return temp ;
    }
    void display()
    {
        if(top < 0)
        {
            System.out.println("stack is empty");
        }
        else
        {
            for(int i = 0 ; i <= top ; i++)
            {
                System.out.println(array[i] + " ");
            }
        }
    }
}
public class stackarray2 {
    public static void main(String[] args) {
        stack obj = new stack();
        obj.push(1);
        // obj.display();
        obj.push(2);
        // obj.display();
        obj.push(3);
        //obj.display();
        obj.push(4);
        obj.display();
        System.out.println("poped element :" + obj.pop());
        obj.display();
        System.out.println("peek element " + obj.peek());
        
    }
}
