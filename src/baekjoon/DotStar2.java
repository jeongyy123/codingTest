package baekjoon;

import java.util.Scanner;

public class DotStar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            String emptyChar = " ".repeat(n - i);
            String stars = "*".repeat(i);
            String result = emptyChar + stars;
            System.out.println(result);
        }
    }
}
