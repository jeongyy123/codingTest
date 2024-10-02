package baekjoon;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int i = 0;
        StringBuilder result;

        while (i < t) {
            int r = scanner.nextInt();
            result = new StringBuilder(scanner.nextLine());

            for (int j = 0; j < result.length(); j++) {
                result.insert(result[j].insert)
            }
            i++;
        }
    }
}
