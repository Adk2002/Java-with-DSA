import java.util.Scanner;

public class floyd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = 1;
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        input.close();

    }
}