package DSA.recursion;

import java.util.Scanner;

public class fibonacciExp {
    public static int Fibonacci(int n){
        if(n==0 || n==1){ //base case
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2); // the main Fibonacci formula
    }
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Fibonacci of " +num + " terms");
        for(int i = 0; i < num; i++){
            System.out.println(Fibonacci(i) + " ");
        }

    }

}