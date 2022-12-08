package array.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1.큰 수 출력하기
 *
 * 설명
 *  N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 *  (첫 번째 수는 무조건 출력한다.)
 *
 * 입력
 *  첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 출력
 *  자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 *
 * 예시 입력1
 * 6
 * 7 3 9 5 6 12
 *
 * 예시 출력1
 * 7 9 6 12
 */
public class Main {

    public List<Integer> solution(int countOfNumber, int[] counts) {
        List<Integer> answer = new ArrayList<Integer>(countOfNumber);
        answer.add(counts[0]);

        for (int i = 1; i < countOfNumber; i++) {
            if (counts[i] > counts[i - 1]) {
                answer.add(counts[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int countOfNumber = scanner.nextInt();
        int[] counts = new int[countOfNumber];

        for (int i = 0; i < countOfNumber; i++) {
            counts[i] = scanner.nextInt();
        }

        for (int count : main.solution(countOfNumber, counts)) {
            System.out.printf(count + " ");
        }
    }
}
