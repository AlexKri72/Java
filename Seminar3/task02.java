// Написать программу перебора n комбинаций из цифр от 0-9  (n длина массива),
// т.е. 
// 0 0 0 
// 0 0 1 
// 0 0 2
// - - -
// 9 9 9 
// n-длина одной строки

package Seminar3;

import java.util.Arrays;

public class task02 {
    public static void main(String[] args) {
        int n = 3; // длина одной строки
        generate(new int[n], 0, 10);
    }

    public static void generate(int[] comb, int index, int n) { // рекурсивная генерация комбинаций

        if (comb.length == index) {
            System.out.println(Arrays.toString(comb));
            return;
        }

        for (int i = 0; i < n; i++) {
            comb[index] = i;
            generate(comb, index + 1, n);
        }

    }
}
