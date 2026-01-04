//This program is to print all combination of "0s & 1s"
package DSA.recursion;

import java.util.Scanner;

class backtracking{

    // the variable "n / num" is responsible for positioning slots like (010, 001, 110)
    //While the variable "K" is responsible for how many different symbols you can put in each slot like ({0,1}, {0,1,2})

    public static void GenerateStrings(int n, int k, String combination){
        //This is base Case
        if(combination.length() == n){
            System.out.println(combination);
            return ;
        }

        //Recursive Call
        for( int i = 0; i < k; i++){
            GenerateStrings(n, k , combination + i);
        }

    }
    public static void main(String[] args) {
        int num, k;
        System.out.println("Enter the length of the string: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        System.out.println("Enter the number of Characters: ");
        k = sc.nextInt();

        System.out.println("All " + k + "-array strings of length " + num + ": ");
        GenerateStrings(num, k, "");

    }
}