package exam;

import java.util.Scanner;

public class N1 {

    static Scanner in = new Scanner(System.in);
    static int a = in.nextInt();
    static int b = in.nextInt();
    static int n = in.nextInt();


    public static void main(String[] args) {

        if (a / n > b / n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
