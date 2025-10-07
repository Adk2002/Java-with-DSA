import java.util.Scanner;

public class inputArr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter the elements of the array\n");

        for(int i = 0; i < size; i++){
            System.out.print("Enter the number " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        //Now this type of declaring for loop is called (for-each) loop
        //The element indicates => add every element in the array.
        for(int element : numbers){
            sum += element;
        }

        //The long method is this way
        /*
        * for (int i = 0; i < numbers.length; i++)
        * {
        *       sum += number
        * }*/

        System.out.println("The sum of the array is: " +sum);
    }
}