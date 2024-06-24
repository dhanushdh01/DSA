package Arrays;

public class ProductOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(solve(arr));
    }
    public static long solve(int[] arr) {
        long m=1;
        for(int i=0;i<arr.length;i++){
            m*=arr[i];
        }
        return m;

    }
}
