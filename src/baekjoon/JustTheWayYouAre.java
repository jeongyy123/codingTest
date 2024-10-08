package baekjoon;

import java.io.*;

public class JustTheWayYouAre {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        while (input != null) {
            String str = br.readLine();
            bw.write(str+"\n");
        }
        bw.flush();
        bw.close();
    }
}
