package Tasks;

import java.util.*;

public class task006 {

    static char[] chars;
    static List<Integer> position = new ArrayList<>();

    public static void main(String[] args) {
        int n = 3;

        generate(new int[n], 0, 10);

        String str = "2? + 3? = 5?";

        str = str.replace(" ", "");
        chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                position.add(i);
            }
        }
    }

    public static void check(int[] comb) { // замена вопросов на комбинации
        for (int i = 0; i < comb.length; i++) {
            chars[position.get(i)] = Character.forDigit(comb[i], 10);

        }

    }

    public static void generate(int[] comb, int index, int n) { // рекурсивная генерация комбинаций

        if (comb.length == index) {
            System.out.println(Arrays.toString(comb));
            check(comb);
            return;
        }

        for (int i = 0; i < n; i++) {
            comb[index] = i;
            generate(comb, index + 1, n);

        }

    }

}