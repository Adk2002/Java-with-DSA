import java.util.Scanner;
public class InputArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Rows: ");
        int rows = input.nextInt();

        System.out.println("Enter Number of Columns: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Elements  of arrays   are: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}