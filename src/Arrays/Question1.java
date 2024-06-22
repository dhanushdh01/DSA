package Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int[] result = new Question1().getTriple(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[" + i + "] = " + result[i]);
        }
    }
    //int[] arr = {1, 2, 1, 3, 4}; excepted output = {1, 1, 0}
    // a < b > c or a > b < c.
    public int[] getTriple(int[] arr) {
        int length = arr.length;
        int[] result = new int[length-2];
        int j = 0;
        for(int i = 1; i< length-1; i++) {
            int a = arr[i-1];
            int b = arr[i];
            int c = arr[i+1];
            if((a<b && b>c) || (a>b && b<c)) {
                result[j++] = 1;
            }else {
                result[j++] = 0;
            }
        }
        return result;
    }
}
