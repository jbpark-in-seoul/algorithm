package string.j;

import java.util.Scanner;

/**
 * 10.가장 짧은 문자 거리
 *
 * 설명
 *  한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소 거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *  첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *  문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 *  첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력합니다.
 *
 * 예시 입력1
 *  teachermode e
 *
 * 예시 출력1
 *  1 0 1 2 1 0 1 2 2 1 0
 */
public class Main {

    public int[] solution(String word, char character) {
        int[] answer = new int[word.length()];
        int distance = 1000;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }

        distance = 1000;

        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) == character) {
                distance = 0;
            } else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char character = scanner.next().charAt(0);

        for (int distance : main.solution(word, character)) {
            System.out.print(distance + " ");
        }
    }
}
