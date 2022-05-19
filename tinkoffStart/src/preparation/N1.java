package preparation;

import java.util.Scanner;

public class N1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int monthCost = in.nextInt();
        int traffic = in.nextInt();
        int addCost = in.nextInt();
        int nextMonthTraffic = in.nextInt();

        if (nextMonthTraffic > traffic) {
            System.out.println(monthCost + (nextMonthTraffic - traffic) * addCost);
        } else {
            System.out.println(monthCost);
        }
    }
}