package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String[] upperWord = word.toUpperCase().split("");

        Map<String, Integer> map = new HashMap<>();
        int num = 0;

        for (String s : upperWord) {
            map.put(s, map.getOrDefault(s,0) +1);
        }

        String maxKey = "";
        int maxValue = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            } else if (entry.getValue() == maxValue) {
                maxKey = "?";
            }
        }
        System.out.println(maxKey);
    }
}

