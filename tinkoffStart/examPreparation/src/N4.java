import java.util.ArrayList;
import java.util.Scanner;

/**
 * У Кости есть бумажка, на которой написано N чисел.
 * Также у него есть возможность не больше, чем K раз, взять любое число с бумажки,
 * после чего закрасить одну из старых цифр, а на ее месте написать новую произвольную цифру.
 *
 * На какое максимальное значение Костя сможет увеличить сумму всех чисел на листочке?
 *
 * В выходной файл выведите одно число — максимальную разность между конечной и начальной суммой.
 *
 * input : 5  2
 *         1  2  1  3  5
 * output : 16
 *
 * input : 3  1
 *         99  5  85
 * output : 10
 */
public class N4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt(), k = in.nextInt(), digit, inc;
        Long result = 0L;

        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            digits.add(in.nextInt());
        }

        ArrayList<Integer> increments = new ArrayList<>(n);
        for (int maxInrementIndex; k > 0; --k) {

            maxInrementIndex = 0;
            for (int i = 0, grade; i < n; ++i) {
                grade = 1;
                digit = digits.get(i);
                inc = (9 - digit % 10) * grade;
                while (digit > 0) {
                    if (9 - digit % 10 > 0)
                        inc = (9 - digit % 10) * grade;
                    grade *= 10;
                    digit /= 10;
                }
                increments.add(i, inc);
                if (increments.get(maxInrementIndex) < increments.get(i)) {
                    maxInrementIndex = i;
                }
            }

            result += increments.get(maxInrementIndex);
            digits.set(maxInrementIndex, digits.get(maxInrementIndex) + increments.get(maxInrementIndex));
//            System.out.println(increments);
//            System.out.println(digits);
            increments.clear();
        }
        System.out.println(result);
    }
}
