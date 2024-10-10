package baekjoon;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder word = new StringBuilder(sc.nextLine());
        String word2 = word.toString();
        String reversedWord = word.reverse().toString();

        System.out.println(word2.equals(reversedWord)? 1: 0);
    }
}
