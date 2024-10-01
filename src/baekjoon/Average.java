package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] grades = new double[n];
        int i = 0;

        while (i < n) {
            grades[i++] = scanner.nextInt();
        }
        double maxGrade = Arrays.stream(grades).max().getAsDouble();

        for (int j = 0; j < grades.length; j++) {
            grades[j] = grades[j] / maxGrade * 100;
        }

        System.out.println(Arrays.stream(grades).average().getAsDouble());

    }
}
