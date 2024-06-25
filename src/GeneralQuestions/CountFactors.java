package GeneralQuestions;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the number of factors : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println("The number of factors of " + n + " is " + count);
    }
}
