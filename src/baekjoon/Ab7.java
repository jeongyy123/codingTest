package baekjoon;


import java.util.Scanner;

public class Ab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int i = 0;

        while (i < t) {

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.printf("Case #%d: %d\n", i + 1, num1 + num2);

            i++;
        }
    }
}
