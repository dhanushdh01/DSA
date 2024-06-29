package MB;

public class SimpleArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 11};
        System.out.println(simpleArraySum(arr));
    }

    public static int simpleArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
