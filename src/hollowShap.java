import java.util.Scanner;

public class hollowShap {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner input   = new Scanner(System.in);
        int num = input.nextInt();

        for(int  i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
    }
}