package baekjoon;

import java.util.Scanner;

public class ReadingVertical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        int i = 0;
        int longestLength = 0;
        while (i < 5) {
            String str = sc.next();
            arr[i] = str;

            if (longestLength < str.length()) {
                longestLength = str.length();
            }
            i++;
        }

        for (int j = 0; j < longestLength; j++) {
            for (int k = 0; k < arr.length; k++) {
                if (j < arr[k].length()) {
                    System.out.print(arr[k].charAt(j));

                }
            }
        }
    }
}
