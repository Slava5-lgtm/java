//* Создание и запись\ дозапись */
package Lection_1;

import java.io.FileWriter;//*Сначало импортируум третию и четвертую строки */
import java.io.IOException;
public class file {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {//* try - для обьроботак ошибок. false или try
            //*отвечает за создания нового файла (или дописать уже сушествующий)*/
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
  
    }
}



//*                                              Чтение, Вариант посимвольно
//* import java.io.*;
//  public class Program {
//      public static void main(String[] args) throws Exception {
//           FileReader fr = new FileReader("file.txt");
//           int c;
//           while ((c = fr.read()) != -1) {
//               char ch = (char) c;
//               if (ch == '\n') {
//                   System.out.print(ch);
//               } else {
//                   System.out.print(ch);
//               }
//           }
// }}  */



//                                                       Вариант построчно
//import java.io.*;

//public class Program {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//        String str;
//        while ((str = br.readLine()) != null) {
//            System.out.printf("== %s ==\n", str);
//        }
//        br.close();
//    }
//}


//**                                            Задачи для самоконтроля

// 1. Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена многочлен
// степени k. Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

//** 2. Даны два файла, в каждом из которых находится запись многочлена.Сформировать файл содержащий сумму многочленов. */