// Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.

package Seminar_3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task01 {

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

        Deque<Integer> result_summ = new ArrayDeque<>();

        int end_d1 = 0;
        int end_d2 = 0;
        int sum_d1_and_d2 = 0;
        System.out.println("- - -");
        System.out.println(d1.size());
        System.out.println(d2.size());

        for (int i = 0; i <= d1.size() + 1; i++) {

            System.out.println("- - -");
            end_d1 = d1.pollLast();
            System.out.println(end_d1);
            end_d2 = d2.pollLast();
            System.out.println(end_d2);
            sum_d1_and_d2 = end_d1 + end_d2;
            System.out.println(sum_d1_and_d2);

            if (sum_d1_and_d2 / 10 > 0) {

                while (sum_d1_and_d2 > 0) {
                    result_summ.addLast(sum_d1_and_d2 % 10);
                    sum_d1_and_d2 = sum_d1_and_d2 / 10;
                }
            } else {
                result_summ.addFirst(sum_d1_and_d2);
            }
        }

        return result_summ;
    }

    public static void main(String[] args) {

        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(sum(d1, d2)); // result [6,6,0,1]

    }
}
