package Lesson_1;

public class arrays {
    public static void main(String[] args) {
        // Однородный массив
        int[] arr = new int[10];
        System.out.println(arr[3]); // обрашения к элементу массива (третий элемент массива)
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
    }
    

}

/** Многомерные
 * int[] arr[] = new int[3][5];
 * for (int[] line : arr) {
 *  for (int item : line) {
 *      System.out.printf("%d ", item);
 * }
 * System.out.println();
 * 
 */

