package Lesson_3;

public class arrays {
//     public static void main(String[] args) {
//         int[] a = new int[] { 1, 9 }; // Есть массив из 2 элементов

//                         // нужно сделать так что было третий элемента
//         int[] b = new int[3]; // создаем второй масив 
//         System.arraycopy(a, 0, b, 0, a.length); // надо из массива (а) в массив (b) скопировать все элементы
//                                                                 // начиная с нулевого элемента и всю длину массива
//         for (int i : a) {
//             System.out.printf("%d ", i);
//         } // 1 9
//         for (int j : b) {
//             System.out.printf("%d ", j);
//         }
//     }
// }

//                                          Также можно через отдельный метод.


    static int[] AddItem(int[] array, int item) { // В этом случае описываем метод AddItem(int[] array(куда будет
                                                  // приходит массив источник данных), int item(тот элемент который требуеться
                                                  // добавить))

        int length = array.length;                // Внутри этого метода мы будим определять длину

        int[] temp = new int[length + 1];         // Создовать новый массив увличеный в даном случае на один элемент 

        System.arraycopy(array, 0, temp, 0, length); // Производим копирован 
        temp[length] = item; // тот элемент который нужно добавит мы дабавим в хвост нового массива
        return temp; // И вернем вновь только что получившийся массив
    }

    public static void main(String[] args) {
         int[] a = new int[] { 0, 9 };
         for (int i : a) { 
            System.out.printf("%d ", i); }
         a = AddItem(a, 2);
         a = AddItem(a, 3);
         for (int j : a) { 
            System.out.printf("%d ", j);
         }
     }
 }
