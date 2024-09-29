package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 + num2);
        }

//        ByfferedReader사용시
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String input = br.readLine();
//
//        while(input != null) {
//            int num1 = br.readLine();
//            int num2 = br.readLine();
//        }
    }
}
