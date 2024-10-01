package baekjoon;

import java.util.Scanner;

public class ReverseBasket {
    public static void main(String[] args) {
        // m : 바구니 개수
        // n : 회차
        // i, j : i~j까지의 바구니 내용물 역순으로 바꾸기

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] basket = new int[m];

        for (int i = 0; i < m; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt()-1;
            int end = scanner.nextInt()-1;

            while(start < end) {
                int temp = basket[start];
                basket[start++] = basket[end];
                basket[end--] = temp;
            }
        }
        for (int i = 0; i < m ; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
