package baekjoon;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        int totalQuantity = scanner.nextInt();

        int i = 0;
        while (i < totalQuantity) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();

            totalPrice -= price * quantity;
            i++;
        }
        if (totalPrice == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
