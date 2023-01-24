/** Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

package Lection_1.DZ;

public class Task_3 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            double squareRoot = Math.sqrt(n) + 2;
            int r = 2;
            while (r <= squareRoot && isPrime) {
                if (n % r == 0)
                    isPrime = false;
                r++;
            }
            System.out.print(isPrime ? (n + " ") : "");
        }
    }
}
