package baekjoon;

import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        while (i < t) {
            String str = scanner.nextLine();
            System.out.println(str.charAt(0)+ str.charAt(str.length()-1));
            i++;
        }
    }
}
