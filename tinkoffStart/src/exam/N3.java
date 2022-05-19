package exam;

import java.util.Scanner;

public class N3 {
    static Scanner in = new Scanner(System.in);
    static Long digit = in.nextLong();


    public static void main(String[] args) {

        int result = 0;
        boolean isCutted = false;

        if (digit == 0) {
            result = 1;
        }

        while (digit > 0) {
            if (digit % 10 != 0) {
                isCutted = true;
            }
            if (isCutted && digit % 10 == 0) {
                result++;
            }
            digit /= 10;
        }

        System.out.println(result);
    }
}
