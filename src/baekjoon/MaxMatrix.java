package baekjoon;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        findMaxNumber(arr);
    }

    private static void findMaxNumber(int[][] arr) {
        int maxNum = 0;
        int maxNumPoint1 = 0;
        int maxNumPoint2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] >= maxNum) {
                    maxNum = arr[i][j];
                    maxNumPoint1 = i+1;
                    maxNumPoint2 = j+1;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(maxNumPoint1 + " " + maxNumPoint2);
    }
}
