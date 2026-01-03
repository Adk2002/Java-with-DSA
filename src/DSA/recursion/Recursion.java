package DSA.recursion;

import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {  //Base Case
            return 1;
        }
        return n * factorial(n - 1);   //Recursive Call
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}