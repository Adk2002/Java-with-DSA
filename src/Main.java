import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i<=number; i++){

            for (int j=1; j<=i+1; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}