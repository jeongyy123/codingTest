package baekjoon;

import java.util.Scanner;

public class Sangsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(biggerNumber(num1, num2));
    }

    public static int biggerNumber(int num1, int num2) {
        int result = 0;
        for (int i = 1; i < 3; i++) {
            if (num1 % 10 * i == num2 % 10 * i) {
                continue;
            } else {
                result = num1 % 10 * i < num2 % 10 * i ? num2 : num1;
            }
        }
        return result;
    }
}
