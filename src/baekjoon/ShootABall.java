package baekjoon;

import java.util.Scanner;

public class ShootABall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] baskets = new int[n];

        int h = 0;
        while ( h < m) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int l = i-1; l <= j-1; l++) {
                baskets[l] = k;
            }
            h++;
        }

        for (int i = 0; i < n ; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
