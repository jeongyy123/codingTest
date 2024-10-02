package baekjoon;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char str = scanner.next().charAt(0);
        System.out.println((int) str);
    }
}
