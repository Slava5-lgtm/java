package Seminar_3;
import java.util.ArrayList;


public class Task0 {
    // Напишите программу на Java для создания нового списка массивов, добавьте некоторые элементы (строки) и распечатайте коллекцию.
    
    public static void main(String[] args) {
        ArrayList<String> collors = new ArrayList<>(); // Создаем список массива

        collors.add("Red"); // Добовляем елементы списка
        collors.add("Green");
        collors.add("Orange");
        collors.add("Orange");
        collors.add("White");
        collors.add("Black");

        

        System.out.println(collors); // Выводим на экран

        for(String item : collors){ // Перебираем элементы списка
            System.out.println(item);
        } 
    }

  
    
}
