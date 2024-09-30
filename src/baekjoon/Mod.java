package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();

        int i = 0;
        while (i < 10) {
            int num = scanner.nextInt();
            set.add(num % 42);
            i++;
        }

        System.out.println(set.size());
    }
}
