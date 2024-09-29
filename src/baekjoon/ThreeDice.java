package baekjoon;

import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        solution(num1, num2, num3 );

    }

    public static void solution(int n1, int n2, int n3) {
        if ((n1 == n3) && (n2 == n3)) {
            System.out.println(10000 + (n1) * 1000);
        } else if ((n1 == n2) || (n1 == n3) || (n2 == n3)) {
            if ((n1 == n2) || (n2 == n3)) {
                System.out.println(1000 + n2 * 100);
            } else {
                System.out.println(1000 + n3 * 100);
            }
        } else {
            System.out.println(Math.max(Math.max(n1, n2), Math.max(n2, n3)) * 100);
        }
    }

}
