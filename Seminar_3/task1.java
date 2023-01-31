// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
package Seminar_3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task1 {

    public static boolean checkOn(Deque<Integer> deque) {

        System.out.println(deque);
        System.out.println(deque.size());

        for (int i = 0; i < deque.size(); i++) {

            int start = deque.pollFirst();
            // deque.getFirst();
            // deque.removeFirst();

            int end = deque.pollLast();
            // deque.getLast();
            // deque.removeLast();

            // System.out.println(" - - - ");
            // System.out.println(start);
            // System.out.println(end);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 3, 1));

        // System.out.println(deque.getFirst());
        // System.out.println(deque.getFirst());

        System.out.println(checkOn(deque));

    }
}