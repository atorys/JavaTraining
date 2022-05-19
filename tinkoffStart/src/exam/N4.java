package exam;

import java.util.Scanner;

public class N4 {

    static Scanner in = new Scanner(System.in);
    static int n = in.nextInt();
    static int inc = 1;
    static char[][] matrix = new char[n][n];

    public static char getNext(char current) {
        current += inc;
        if (current == 'z' || current == 'a') {
            inc *= -1;
        }
        return current;
    }

    public static void main(String[] args) {

        int step = 0;
        char fill;

        for (int y = 0; y < (n / 2 + n % 2); ++y, ++step) {

            fill = 'a';
            for (int x = step; x < (n / 2 + n % 2); ++x) {
                matrix[y][x] = matrix[y][n - x - 1] = matrix[n - y - 1][x] = matrix[n - y - 1][n - x - 1] =  fill;
                matrix[x][y] = matrix[n - x - 1][y] = matrix[x][n - y - 1] = matrix[n - x - 1][n - y - 1] =  fill;
                fill = getNext(fill);
            }
        }

        for (int y = 0; y < n; ++y) {

            for (int x = 0; x < n; ++x) {
                System.out.print(matrix[y][x]);
            }
            System.out.println();
        }

    }
}
