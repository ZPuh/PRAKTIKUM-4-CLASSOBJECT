package no06;

import java.util.Scanner;

public class Recursif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n = scanner.nextInt();

        System.out.println(Fibonacci(n));

    }

    static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
