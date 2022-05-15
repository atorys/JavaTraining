import java.util.Scanner;

public class N9 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), maxCheck = 0, cuponCheck = 0;
        int sum = 0;

        int[] mealsCheck = new int[n];
        for (int i = 0; i < n; ++i) {
            mealsCheck[i] = in.nextInt();
            sum += mealsCheck[i];
        }

        for (int i = n - 1; i > 0; --i) {
            if (mealsCheck[i] > 100 && maxCheck != 0) {
                if (cuponCheck != 0 && cuponCheck > maxCheck) {
                    sum -= cuponCheck;
                    cuponCheck = 0;
                } else {
                    cuponCheck = mealsCheck[i];
                    sum -= maxCheck;
                    maxCheck = 0;
                }
            } else if (mealsCheck[i] > maxCheck) {
                maxCheck = mealsCheck[i];
            }
        }

        System.out.println(sum);
    }
}

// 5
// 10
// 20
//101
// 20
// 200