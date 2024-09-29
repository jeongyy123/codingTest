package baekjoon;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = num; i >= 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}
