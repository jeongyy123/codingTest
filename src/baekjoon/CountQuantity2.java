package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class CountQuantity2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] number = new int[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i : number) {
            if (i == v) {
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
