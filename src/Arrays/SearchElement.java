package Arrays;
import java.lang.*;
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of test cases
        int T = sc.nextInt();
        // each test case consists of 2 lines
        for (int i = 1; i<=T; i++) {
            // 1. Integer denoting the length of array, followed by array elements
            int size = sc.nextInt();
            int[] A = new int[size];
            for (int j = 0; j<size; j++) {
                A[j] = sc.nextInt();
            }
            // 2. integer to search in array
            int B = sc.nextInt();
            searchElement(B, A);
        }
    }
    public static void searchElement(int B, int A[]) {
        int counter = 0;
        for (int j=0; j<A.length; j++) {
            if (A[j] == B) {
                counter=1;
            }
        }
        if (counter == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}