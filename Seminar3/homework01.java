/*
Задание 1.
Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера), если будут дубликаты фамилий, 
то должны выводиться оба номера (если помним Map не может хранить дубликаты, будет заменять номер телефона по ключу, 
нужно подумать как не допустить такого)
*/
package Seminar3;

import java.util.HashMap;
import java.util.Map;

public class homework01 {
    public static void main(String[] args) {
        Map<Integer, String> phoneBook = new HashMap();
        phoneBook.put(212133, "Лидия Аркадьевна Бубликова");
        phoneBook.put(162348, "Иван Михайлович Серебряков");
        phoneBook.put(8082771, "Дональд Джон Трамп");
        System.out.println(phoneBook);
    }
}
