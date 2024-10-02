package baekjoon;

import java.util.Scanner;

public class SearchAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] alphabet = new char[26];
        int[] result = new int[26];

        for (int i = 97; i < 123; i++) {
            alphabet[i - 97] = (char) i;
        }

        for (int i = 0; i < alphabet.length; i++) {
            result[i] = str.indexOf(alphabet[i]);
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
