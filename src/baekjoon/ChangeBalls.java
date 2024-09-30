package baekjoon;

import java.util.Scanner;

public class ChangeBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] basket = new int[n];

        for (int i = 1; i < n + 1; i++) {
            basket[i - 1] = i;
        }

        for (int k = 0; k < m; k++) {
            int i = scanner.nextInt()-1;
            int j = scanner.nextInt()-1;
            int temp = 0;

            temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
