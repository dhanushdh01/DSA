package GeneralQuestions;

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs : ");
        int A = sc.nextInt();

        System.out.println(climbStairs(A) + " ways to climb the stairs.");
    }


    // TC: O(A)
    // SC: O(1) - Constant space

    public static int climbStairs(int A) {
        if (A == 0 || A == 1){
            return 1;
        }
        int prev2 = 1;
        int prev = 1;
        for(int i = 2; i <= A; i++){
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }

    // Using Recursion
    // TC: O(2^N) - Exponential time complexity
    // SC: O(N) - Recursive stack space
    /*
    public static int climbStairs(int A) {
        if (A == 0 || A == 1){
            return 1;
        }
        return climbStairs(A-1) + climbStairs(A-2);
     */

    // Using DP
    // TC: O(A)
    // SC: O(A)
    /*
    public static int climbStairs(int A) {
        if (A == 0 || A == 1){
            return 1;
        }
        int[] DP = new int[A+1];
        DP[0] = 1;
        DP[1] = 1;
        for(int i = 2; i <= A; i++){
            DP[i] = DP[i-1] + DP[i-2];
        }
        return DP[A];
     */
}
