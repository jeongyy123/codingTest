package baekjoon;

import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = scanner.nextInt();
        ;

        int count = 1;
        int index = 1;

        while (count < 9) {
            int inputNum = scanner.nextInt();
            if (maxNum < inputNum) {
                maxNum = inputNum;
                index = count+1;
            }
            count++;
        }
        System.out.println(maxNum + "\n" + index);
    }
}
