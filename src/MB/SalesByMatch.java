package MB;

import java.util.HashMap;
import java.util.Scanner;

public class SalesByMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        //int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n, ar));
    }

    public static int sockMerchant(int n, int[] ar) {
//        int[] count = new int[101];
//        int pairs = 0;
//        for (int i = 0; i < n; i++) {
//            count[ar[i]]++;
//            if (count[ar[i]] % 2 == 0) {
//                pairs++;
//            }
//        }
//        return pairs;

        HashMap<Integer, Integer> sockCount = new HashMap<>();
        for (int sock : ar) {
            sockCount.put(sock, sockCount.getOrDefault(sock, 0) + 1);
        }

        int pairs = 0;
        for (int count : sockCount.values()) {
            pairs += count / 2;
        }

        return pairs;
    }
}
/*
Logic is to count the number of socks of each color and then divide it by 2 to get the number of pairs.

1.Initialization: We start by creating a HashMap called sockCount to store the count of each type of sock.
    The key of the HashMap is the color of the sock, and the value is the count of that color.
    We also initialize a variable pairs to 0 to keep track of the total number of pairs.
2.Counting Socks: We iterate through the list of socks (ar):
    For each sock, we check if it is already in the HashMap.
    If it is, we increment its count by 1.
    If it is not, we add it to the HashMap with an initial count of 1.
3.Calculating Pairs: After counting all the socks, we need to calculate the number of pairs:
    We initialize a variable pairs to 0.
    We iterate through the values in the sockCount HashMap. These values represent the counts of each type of sock.
    For each count, we use integer division (count / 2) to determine how many pairs can be made from that count. We add this number to pairs.

4.Returning the Result: Finally, we return the total number of pairs.
 */