public class addArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{4, 5, 6}, {8, 9, 7}};
        int[][] sumArray = new int [arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("sum of 2d array");

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(sumArray[i][j] + " ");
            }
        }
    }
}