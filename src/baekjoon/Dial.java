package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();
        int sum = 0;

        for (int i = 0; i < charArray.length; i++) {
            byte num = (byte) charArray[i];
            if(65 <= num && num <= 67) {
                sum += 3;
            } else if (68 <= num && num <= 70) {
                sum += 4;
            } else if (71 <= num && num <= 73) {
                sum += 5;
            } else if (74 <= num && num <= 76) {
                sum += 6;
            } else if (77 <= num && num <= 79) {
                sum += 7;
            } else if (80 <= num && num <= 83) {
                sum += 8;
            } else if (84 <= num && num <= 86) {
                sum += 9;
            } else {
                sum += 10;
            }
        }

        System.out.print(sum);
    }
}
