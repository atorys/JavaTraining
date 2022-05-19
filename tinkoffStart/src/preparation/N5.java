package preparation;

import java.util.Scanner;

/**
 * Во время разработки некоторой задачи Саша решил сгенерировать несколько новых тестов.
 * Каждый тест Саши должен представлять собой натуральное число, не меньшее l и не большее r.
 * Кроме того, натуральное число в тесте обязательно должно состоять из одинаковых цифр.
 *
 * Например, число 999 подходит под это требование, а число 123 — нет.
 * Какое максимальное число различных тестов сможет создать Саша?
 *
 * Выведите одно число — количество тестов, которое может сделать Саша.
 *
 * input :     4  7
 * output :    4
 *
 * input :     10  100
 * output :    9
 */
public class N5 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        long l = in.nextLong(), r = in.nextLong();
        long result = 0L, inc = 0L;


        while (l <= r) {

            while (l >= inc * 10) {
                inc = inc * 10 + 1;
            }
            if (l / inc == l % 10 && l % inc == 0) {
                result++;
                System.out.println("inc=" + inc + " l=" + l);
                l += inc;
            } else {
                l += 1;
            }
        }
        System.out.println(result);
    }
}
