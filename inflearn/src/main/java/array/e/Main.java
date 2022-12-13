package array.e;

import java.util.Scanner;

/**
 * 5.소수(에라토스테네스 체)
 *
 * 설명
 *  자연수 N이 입력되면 1부터 N까지 소수의 개수를 출력하는 프로그램을 작성하세요.
 *  만약, 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 입력
 *  첫 줄에 자연수의 개수 N(2 <= N <= 200,000)이 주어집니다.
 *
 * 출력
 *  첫 줄에 소수의 개수를 출력합니다.
 *
 * 예시 입력1
 *  20
 *
 * 예시 출력1
 *  8
 */
public class Main {

    public int solution(int number) {
        int answer = 0;
        int[] numbers = new int[number + 1];

        for (int i = 2; i <= number; i++) {
            if (numbers[i] == 0) {
                answer++;
                for (int j = i; j <= number; j = j + i) {
                    numbers[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(main.solution(number));
    }
}
