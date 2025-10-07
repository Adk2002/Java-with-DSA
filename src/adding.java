import java.util.Scanner;

class sum {
    static void adding(){
        Scanner input = new Scanner(System.in);

        int sum, num1, num2;
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter a number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
public class adding {

    public static void main(String[] args){
        System.out.print("Welcome to the Sum Calculator \n");
        sum.adding();
    }
}
