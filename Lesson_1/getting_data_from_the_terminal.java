package Lesson_1;

import java.util.Scanner;                               //* Чтобы заберать чтото из терминала (или читать файл с компа) надо
                                                        //* импортировать Scaner */
public class getting_data_from_the_terminal {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);      //** Далее объявляем экземпляр класса iScaner где в качестве аргумента
                                                        //* указываем (System.in) откуда что будем забирать */

        System.out.printf("name: ");
        String name = iScanner.nextLine();

        
        System.out.printf("int a: ");           //* работа с целыми числами */           
        int x = iScanner.nextInt();

        System.out.printf("double a: ");        //* работа с вешественими */
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();

        boolean flag = iScanner.hasNextInt();           //* проверка для коректного ввода данных */
        System.out.println(flag);


        System.out.printf("Привет, %s!", name);
        iScanner.close();                               /* Ввывод на экран */
    }
}

/**
 * Виды спецификаторов
 * %d: целочисленных значений
 * %x: для вывода шестнадцатеричных чисел
 * %f: для вывода чисел с плавающей точкой
 * %e: для вывода чисел в экспоненциальной форме,
 * например, 3.1415e+01
 * %c: для вывода одиночного символа
 * %s: для вывода строковых значений
 * 
 * Сколько знаков после запятой
 * float pi = 3.1415f;
 * System.out.printf("%f\n", pi); // 3,141500
 * System.out.printf("%.2f\n", pi); // 3,14
 * System.out.printf("%.3f\n", pi); // 3,141
 * System.out.printf("%e\n", pi); // 3,141500e+00
 * System.out.printf("%.2e\n", pi); // 3,14e+00
 * System.out.printf("%.3e\n", pi); // 3,141e+00
 */