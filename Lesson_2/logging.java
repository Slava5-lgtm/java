package Lesson_2;

import java.io.IOException;
import java.util.logging.*;
public class logging {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException  {
        Logger logger = Logger.getLogger(logger.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();                 // это в консоль
        FileHandler fh = new FileHandler("log.txt");        // зто в файл в нашем случае появиться log.txt
        // logger.addHandler(ch);
        logger.addHandler(fh);

        //SimpleFormatter sFormat = new SimpleFormatter(); // это - тестовый формат
        XMLFormatter xml = new XMLFormatter();
        //fh.setFormatter(sFormat);
        fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
        // Есть определеное API которое без определеного телодвижения мжно
        // воспользоваться даным функционалом. Логирования называют
        // также журнолирования то есть создаеться журнал ошибок
        // Логи содержат системную информацию работы программного или аппаратного
        // комплекса. В них записываются действия разного
        // приоритетаот пользователя, или программного продукта. Процесс ведения логов
        // называют “логированием” (журналированием).

        // Логирование. Использование. Основы
        // Использование
        // Logger logger = Logger.getLogger()

        // Уровни важности
        // INFO, DEBUG, ERROR, WARNING и др.

        // Вывод
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);

        // Формат вывода: структурированный, абы как*
        // XMLFormatter, SimpleFormatter
        
    }

}