class arrAdd {
    static int sum(int[] arr, int n) {
        if(n == 0){
            return 0;
        }

        return sum (arr, n-1) + arr[n-1];
    }
}
public class array {

    public static void main(String[] args){
        int[] arr = {12, 85, 96,85};
        int s = arrAdd.sum(arr, arr.length);
        System.out.println(s);

    }

}