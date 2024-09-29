package baekjoon;

import java.util.Scanner;

public class OvenTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int time = scanner.nextInt();

        timer(hour, min, time);
    }

    public static void timer(int hour, int min, int time) {
        min += time;
        if (min >= 60) {
            hour += min / 60;
            min -= 60 * (min / 60);
        }
        if(hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + min);
    }
}
