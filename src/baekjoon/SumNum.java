package baekjoon;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt("" + numbers.charAt(i));
        }

        System.out.println(sum);
    }
}
