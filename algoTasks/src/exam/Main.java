package exam;

import java.util.Scanner;

public class Main {


    static Scanner in = new Scanner(System.in);
    static int n = in.nextInt(), k = in.nextInt();
    static int[] arr = new int[n];

    public static Long factorial(int digit) {
        if (digit <= 1) {
            return 1L;
        }

        return digit * factorial(digit - 1);
    }

    public static void main(String[] args) {
        int next, strike;
        Long result = 0L;

        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n;) {

            next = i;
            strike = 0;

            for (int y = i ; y < n; ++y) {
                if (arr[y] <= arr[i]) {
                    strike++;
                } else if (next == i) {
                    next = y;
                }
            }

            if (strike > k) {
                result += factorial(strike) / (factorial(strike - k) * factorial(k));
            }  else if (strike == k) {
                result++;
            }

            if (next == i) {
                break;
            }
            i = next;
        }
        System.out.println(result);
    }
}
