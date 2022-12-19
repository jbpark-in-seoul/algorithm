package array.h;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8.등수 구하기
 *
 * 설명
 *  N명의 학생의 국어 점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *  첫 줄에 N(3 <= N <= 100)이 입력되고, 두 번째 줄에 국어 점수를 의미하는 N개의 정수가 입력된다.
 *
 * 출력
 *  입력된 순서대로 등수를 출력한다.
 *
 * 예시 입력1
 *  5
 *  87 89 92 100 75
 *
 * 예시 출력1
 *  4 3 2 1 5
 */
public class Main {

    public ArrayList<Integer> solution(int[] scores) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            int rank = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }
            answer.add(rank);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int[] scores = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            scores[i] = scanner.nextInt();
        }

        for (int rank : main.solution(scores)) {
            System.out.printf(rank + " ");
        }
    }
}
