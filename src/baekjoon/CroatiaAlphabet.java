package baekjoon;

import java.io.*;

public class CroatiaAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] str = br.readLine().toCharArray();
        int count = 0;


        for (int i = 0; i < str.length; i++) {
            if (str.length == 1) {
                count++;
                break;
            }

            if (i + 1 < str.length && str[i] == 'c' && str[i + 1] == '=') {
                count++;
                i++;
            } else if (i + 1 < str.length && str[i] == 'c' && str[i + 1] == '-') {
                count++;
                i++;
            } else if (i + 2 < str.length && str[i] == 'd' && str[i + 1] == 'z' && str[i + 2] == '=') {
                count++;
                i += 2;
            } else if (i + 1 < str.length && str[i] == 'd' && str[i + 1] == '-') {
                count++;
                i++;
            } else if (i + 1 < str.length && str[i] == 'l' && str[i + 1] == 'j') {
                count++;
                i++;
            } else if (i + 1 < str.length && str[i] == 'n' && str[i + 1] == 'j') {
                count++;
                i++;
            } else if (i + 1 < str.length && str[i] == 's' && str[i + 1] == '=') {
                count++;
                i++;
            } else if (i + 1 < str.length && str[i] == 'z' && str[i + 1] == '=') {
                count++;
                i++;
            } else {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class CroatiaAlphabet {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        char[] s = br.readLine().toCharArray();
//        int cnt = 0;
//        int i = 0;
//        while(i<s.length) {
//            if(s[i] == 'd' && s[i+1] == 'z') {
//                cnt += 1;
//                i += 2;
//            } else if (s[i] == 'n' && s[i+1] == 'j') {
//                cnt += 1;
//                i += 2;
//            } else if (s[i] == 'l' && s[i+1] == 'j') {
//                cnt += 1;
//                i += 2;
//            } else if (s[i] == '=' || s[i] == '-') {
//                i += 1;
//            } else {
//                cnt += 1;
//                i++;
//            }
//        }
//        System.out.println(cnt);
//    }
//}