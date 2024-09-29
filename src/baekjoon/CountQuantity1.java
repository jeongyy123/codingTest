package baekjoon;

import java.util.Scanner;

public class CountQuantity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] number = new int[t];

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        int count = 0;
        int v = scanner.nextInt();
        for (int i : number) {
            if(i == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
