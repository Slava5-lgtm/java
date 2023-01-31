package Lesson_3;
import java.util.List;
import java.util.Arrays;
public class ArrayList {
    //                                   Иерархия коллекций. List
    // List – пронумерованный набор элементов.
    // Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент.
    // Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.
    // URL
    // ArrayList, LinkedList (Vector, Stack – устаревшие)
    

    //                                  Коллекции. Функционал
    // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    // get(pos) – возвращает элемент из списка по указанной позиции
    // indexOf(item) – первое вхождение или -1
    // lastIndexOf(item) – последнее вхождение или -1
    // remove(pos) – удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
    // void sort(Comparator) – сортирует набор данных по правилу
    //subList(int start, int end) – получение набора данных от позиции start до end
    public static void main(String[] args) {
        // int day = 29;
        // int month = 9;
        // int year = 1990;
        // Integer[] date = { day, month, year };
        // List<Integer> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year }; // формирую массив StringBuilder
        List<StringBuilder> d = Arrays.asList(date); // на основе его формирую колекцию
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // 29, 09, 1990
        // У нас есть массив [] date и d колекция и поменяю значения в масиве она также поменяеться и в колекции
    }

        // clear() – очистка списка
        // toString() – «конвертация» списка в строку
        // Arrays.asList – преобразует массив в список
        // containsAll(col) – проверяет включение всех элементов из col
        // removeAll(col) – удаляет элементы, имеющиеся в col
        // retainAll(col) – оставляет элементы, имеющиеся в col
        // toArray() – конвертация списка в массив Object’ов
        // toArray(type array) – конвертация списка в массив type
        // List.copyOf(col) – возвращает копию списка на основе имеющегося
        // List.of(item1, item2,...) – возвращает неизменяемый список 
}