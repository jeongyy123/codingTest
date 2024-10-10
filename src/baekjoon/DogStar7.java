package baekjoon;

import java.util.Scanner;

public class DogStar7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= (2*n-1)/2; i++) {
            String emptyStart = " ".repeat(n-i);
            String stars = "*".repeat(2*i-1);
            System.out.println(emptyStart + stars);
        }

        for (int i = (2*n)/2; i >= 1 ; i--) {
            String emptyStart = " ".repeat(n-i);
            String stars = "*".repeat(2*i-1);
            System.out.println(emptyStart + stars);
        }
    }
}
