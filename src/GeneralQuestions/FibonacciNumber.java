package GeneralQuestions;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the Fibonacci Number : ");
        int A = sc.nextInt();
        // ---- Using Recursion ----
        // TC: O(2^N) - Exponential time complexity
        // SC: O(N) - Recursive stack space
        //System.out.println(fib(A));


        /* ---- Using DP ----
        int[] DP = new int[A+1];
        for(int i = 0; i <= A; i++){
            DP[i] = -1;
        }
        System.out.println(Fib(A,DP));
        */



        //Using a bottom-up approach for calculating Fibonacci numbers using DP
        // TC: O(A)
        // SC: O(A)
        /*
        if (A == 0 || A == 1){
            System.out.println(A);
        }
        int[] DP = new int[A+1];
        DP[0] = 0;
        DP[1] = 1;
        for(int i = 2; i <= A; i++){
            DP[i] = DP[i-1] + DP[i-2];
        }
        System.out.println(DP[A]);
        */



        // Space Optimization
        // TC: O(A)
        // SC: O(1) - Constant space
        if (A == 0 || A == 1){
            System.out.println(A);
        }
        int prev2 = 0;
        int prev = 1;
        for(int i = 2; i <= A; i++){
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        System.out.println(prev);
    }

    //Using Recursion Function
    public static int fib(int n){
        //base case
        if(n == 0 || n == 1){
            return n;
        }
        //recursive call
        return fib(n-1) + fib(n-2);
    }

    //Using Recursion Function and DP
    public static int Fib(int N,int[] DP){
        //base case
        if(N == 0 || N == 1){
            return N;
        }
        //Check if the DP is -1 then Store the Nth Fibonacci Number in DP
        if(DP[N] == -1){
            DP[N] = Fib(N-1,DP) + Fib(N-2,DP);
        }
        return DP[N];
    }
}
