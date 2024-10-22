package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if(isGroupWord(word)) {
                groupWordCount++;
            }
        }
        System.out.println(groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prevChar = ' ';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if(currentChar != prevChar) {
              if(seen[currentChar - 'a']) {
                  return false;
              }
              seen[currentChar-'a'] = true;
            }
            prevChar = currentChar;
        }
        return true;
    }
}
