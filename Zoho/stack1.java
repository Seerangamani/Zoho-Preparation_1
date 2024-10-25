import java.util.Scanner;

public class stack1 {
    private int[] array;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public stack1(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1; // Initialize top to -1 to indicate the stack is empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        array[++top] = value;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return array[top--];
    }

    // Method to display the elements of the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements to push onto the stack:");
        int n = scan.nextInt();

        stack1 stack = new stack1(n);

        System.out.println("Enter the elements to push onto the stack:");
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            stack.push(value);
        }

        // Display the stack elements
        stack.display();

        // Example of popping an element
        System.out.println("Popped element: " + stack.pop());
        stack.display();
        
        scan.close();
    }
}
