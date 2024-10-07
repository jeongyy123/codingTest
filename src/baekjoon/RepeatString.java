package baekjoon;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String str = scanner.next();

            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {
                result.append(String.valueOf(c).repeat(r));
            }
            System.out.println(result.toString());
        }
    }
}
