package GeneralQuestions;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 1;
        while(num <= N){ // for all num from 1 to N
            int arm = 0;
            int n = num;
            while(n > 0){
                int digit = n % 10;
                arm = arm + (digit * digit * digit);
                n = n / 10;
            }
            if(arm == num){ // if sum of cube = num, then print
                System.out.println(num);
            }
            num++;
        }
    }


}
