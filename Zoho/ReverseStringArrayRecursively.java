import java.util.Scanner;

public class ReverseStringArrayRecursively {

    // Recursive function to reverse an array of strings
    public String[] reverseArray(String[] array, int start, int end) {
        if (start >= end) {
            return array;
        }
        // Swap elements at start and end indices
        String temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        // Recur for the rest of the array
        return reverseArray(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings in the array:");
        int n = scan.nextInt();
        scan.nextLine(); // Consume newline

        String[] strArray = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strArray[i] = scan.nextLine();
        }

        ReverseStringArrayRecursively obj = new ReverseStringArrayRecursively();
        String[] reversedArray = obj.reverseArray(strArray, 0, n - 1);

        System.out.println("Reversed array:");
        for (String str : reversedArray) {
            System.out.println(str);
        }

        scan.close();
    }
}
