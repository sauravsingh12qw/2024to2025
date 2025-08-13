import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two positive integers
        System.out.print("Enter first positive integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer: ");
        int b = sc.nextInt();

        // 1. Swapping using a 3rd variable
        System.out.println("\n--- Swapping using 3rd variable ---");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // 2. Swapping without using 3rd variable
        System.out.println("\n--- Swapping without 3rd variable ---");
        a = a + b;  // sum of both
        b = a - b;  // (a+b) - b = a
        a = a - b;  // (a+b) - a = b
        System.out.println("After swap: a = " + a + ", b = " + b);

        sc.close();
    }
}
