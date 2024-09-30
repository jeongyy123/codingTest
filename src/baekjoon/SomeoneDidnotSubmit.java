package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SomeoneDidnotSubmit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] students = new int[30];
        for (int i = 0; i < 30; i++) {
            students[i] = i + 1;
        }

        int i = 0;
        while (i < 28) {
            int submit = scanner.nextInt();
            students = Arrays.stream(students).filter(j -> j != submit).toArray();
            i++;
        }

        int min = Arrays.stream(students).min().getAsInt();
        int max = Arrays.stream(students).max().getAsInt();

        System.out.println(min + " " + max);
    }

}
