package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }

        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }

//        // Array에서 Math, Min 값 구하기
//        Arrays.stream(arr).max().getAsInt();
//        Arrays.stream(arr).min().getAsInt();

        bw.write(Integer.toString(minNum) + " " + Integer.toString(maxNum));
        bw.flush();
        bw.close();
    }
}
