package baekjoon;

import java.util.Scanner;

public class Sangsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = Math.max(Integer.parseInt(new StringBuilder(String.valueOf(num1)).reverse().toString()), Integer.parseInt(new StringBuilder(String.valueOf(num2)).reverse().toString()));
        System.out.println(max);
    }

}
