package no06;

import java.util.Scanner;

public class FibonacciRecursif {

    public static void main(String[] args) {
        // fibonacci
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...  
        Scanner scanner = new Scanner(System.in);
        FibonacciRecursif obj = new FibonacciRecursif();

        System.out.print("n : ");
        int n = scanner.nextInt();       
        
        for (int i = 1; i <= n; i++) {
        System.out.print(obj.fibonacci(i)+" ");            
        }

    }

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {            
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
