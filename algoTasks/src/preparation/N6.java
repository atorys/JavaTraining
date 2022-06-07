package preparation;

import java.util.Scanner;

public class N6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();
        int a, x = -1, y = -1;
        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            if (i % 2 == a % 2) {
                if (x == -1) {
                    x = i + 1;
                } else if (y == -1) {
                    y = i + 1;
                } else {
                    x = y = 0;
                }
            }
        }

        if (x == y || x % 2 == y % 2 || y == -1) {
            System.out.println("-1 -1");
        } else {
            System.out.println(x  + " " + y);
        }
    }
}
