package baekjoon;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int king = 1-scanner.nextInt();
        int queen = 1-scanner.nextInt();
        int rook = 2-scanner.nextInt();
        int bishop = 2-scanner.nextInt();
        int knight = 2-scanner.nextInt();
        int pawn = 8-scanner.nextInt();

        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}
