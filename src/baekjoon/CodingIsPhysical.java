package baekjoon;

import java.util.Scanner;

public class CodingIsPhysical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int quota = num / 4;

        System.out.println( "long ".repeat(quota) + "int");
    }
}
