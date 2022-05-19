package exam;

import java.util.Scanner;

public class N5 {

    static Scanner in = new Scanner(System.in);
    static int n = in.nextInt();
    static int k = in.nextInt();

    static public int getBeauty(int[] order) {
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            sum += order[i] * (i + 1);
        }
        return sum;
    }

    static public boolean isOrderChanged(int[] order) {
        int i, deviderIndex = 0, tmp;

        for (i = n - 2; i >= 0; --i) {
            if (order[i] < order[i + 1]) {
                deviderIndex = i;
                break;
            }
        }

        if (i < 0) {
            return false;
        } else {
            for (i = n - 1; i >= 0; --i) {
                if (order[i] > order[deviderIndex]) {
                    tmp = order[i];
                    order[i] = order[deviderIndex];
                    order[deviderIndex] = tmp;
                    break;
                }
            }
            for (i = n - 1; i > deviderIndex + 1; --i, ++deviderIndex) {
                tmp = order[i];
                order[i] = order[deviderIndex + 1];
                order[deviderIndex + 1] = tmp;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int count = 0;

        int[] order = new int[n];

        for (int i = 0; i < n; ++i) {
            order[i] = i + 1;
        }

        do {
            if (getBeauty(order) % k == 0) {
                count++;
            }
        } while (isOrderChanged(order));

        System.out.println(count);
    }
}