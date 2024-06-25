package GeneralQuestions;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter the number to find it whether it is Fizz or Buzz or FizzBuzz num : " );
        int num=d.nextInt();
        if(num % 3 ==0 && num % 5 == 0){
            System.out.println("GeneralQuestions/FizzBuzz");
        }else if(num % 5 == 0){
            System.out.println("Buzz");
        }else if(num % 3 ==0 ){
            System.out.println("Fizz");
        }
    }
}
