// Задание 3.
// Решить задачу под номером 5.
// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package Seminar2;

import java.util.*;

public class homework03 {

    static char[] chars;
    static List<Integer> position = new ArrayList<>();

    public static void main(String[] args) {

        // МОЖНО ВКЛЮЧИТЬ РУЧНОЙ ВВОД
        // System.out.print("\n\nЗадайте выражение вида: 2? + ?5 = 69 , а мы попытаемся
        // его восстановить: ");
        // Scanner Scanner = new Scanner(System.in);
        // String word = Scanner.nextLine();
        // Scanner.close();

        String word = "2? + ?5 = 69"; // задаем выражение, с пробелами или без пробелов - всё равно
        System.out.println("\n\nЗадано выражение: " + word + " , его решения:");

        word = word.replace(" ", ""); // убираем пробелы

        int n = word.length() - word.replace("?", "").length(); // посчитали количество вопросительных знаков
        System.out.println("Количество знаков '?' - " + n);

        generate(new int[n], 0, 10);

        chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                position.add(i);
            }
        }

        // int count = 0;
        // for (int i = 0; i < 10; i++) { // заменяем "?" числами и проверяем выполнение
        // условия выражения
        // for (int j = 0; j < 10; j++) {
        // if (Integer.valueOf(words[0].replace("?", "" + i))
        // + Integer.valueOf(words[1].replace("?", "" + j)) ==
        // Integer.valueOf(words[2])) {
        // count += 1;
        // System.out.println(count + ") " + words[0].replace("?", "" + i) + " + "
        // + words[1].replace("?", "" + j) + " = " + words[2] + "\n\n");
        // }
        // }
        // }
        // if (count == 0) {
        // System.out.println("Решений нет\n");
    }

    public static void generate(int[] comb, int index, int n) { // генерация массива чисел вида 0 0 , 0 1 . . . 9 9
        if (comb.length == index) {
            // massive.add(Arrays.asList(comb));
            return;
        }

        for (int i = 0; i < n; i++) {
            comb[index] = i;
            generate(comb, index + 1, n);
        }
    }
}
