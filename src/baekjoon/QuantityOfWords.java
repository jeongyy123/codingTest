package baekjoon;

import java.util.Scanner;

public class QuantityOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        int result = 0;

        if (!sentence.equals(" ")) {
            result = sentence.strip().split(" ").length;
        }
        System.out.println(result);
    }
}
