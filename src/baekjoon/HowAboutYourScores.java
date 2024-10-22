package baekjoon;

import java.util.Scanner;

public class HowAboutYourScores {
    public static void main(String[] args) {
        // 전공평점  = 전공과목별(학점 * 과목평점)의 합 / 학점의 총합
        // 전공평점 3.3이상
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double totalScore = 0;
        double majorSum = 0;

        while (i < 20) {
            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            switch (grade) {
                case "A+":
                    totalScore += score;
                    majorSum += (score * 4.5);
                    break;
                case "A0":
                    totalScore += score;
                    majorSum += (score * 4.0);
                    break;
                case "B+":
                    totalScore += score;
                    majorSum += (score * 3.5);
                    break;
                case "B0":
                    totalScore += score;
                    majorSum += (score * 3.0);
                    break;
                case "C+":
                    totalScore += score;
                    majorSum += (score * 2.5);
                    break;
                case "C0":
                    totalScore += score;
                    majorSum += (score * 2.0);
                    break;
                case "D+":
                    totalScore += score;
                    majorSum += (score * 1.5);
                    break;
                case "D0":
                    totalScore += score;
                    majorSum += (score * 1.0);
                    break;
                case "F":
                    totalScore += score;
                    majorSum += (score * 0.0);
                    break;
                default:
                    break;
            }
            i++;
        }
        System.out.println(majorSum / totalScore);
    }
}
