package preparation;

import java.util.Scanner;

public class N2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt(), count = 0;
        while (N > 1) {
            count++;
            N = N/2 + N%2;
        }
        System.out.println(count);
    }
}