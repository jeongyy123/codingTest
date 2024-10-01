package baekjoon;

import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int i = 0;
        while (i < t) {
            String str = scanner.nextLine();
            System.out.println(str);
            i++;
        }
    }
}
