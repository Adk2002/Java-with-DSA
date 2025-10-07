//Now this code  is  to print every element the 2D arrays
public class Arrays {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};

        //First Loop for Row
        for (int i =0; i < 2; i++){
            //Second Loop is for Column
            for (int j =0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}