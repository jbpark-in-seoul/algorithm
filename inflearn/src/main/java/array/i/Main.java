package array.i;

import java.util.Scanner;

/**
 * 9.격자판 최대 합
 *
 * 설명
 *  N * N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력합니다.
 *
 * 입력
 *  첫 줄에 자연수 N이 주어진다(2 <= N <= 50)
 *  두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다.
 *  각 자연수는 100을 넘지 않는다.
 *
 * 출력
 *  최대 합을 출력한다.
 *
 * 예시 입력1
 *  5
 *  10 13 10 12 15
 *  12 39 30 23 11
 *  11 25 50 53 15
 *  19 27 29 37 27
 *  19 13 30 13 19
 *
 * 예시 출력1
 *  155
 */
public class Main {

    public int solution(int size, int[][] grid) {
        int answer = 0;
        int firstSum;
        int secondSum;

        // 행과 열의 합
        for (int i = 0; i < size; i++) {
            firstSum = 0;
            secondSum = 0;
            for (int j = 0; j < size; j++) {
                firstSum += grid[i][j];
                secondSum += grid[j][i];
            }

            answer = Math.max(answer, firstSum);
            answer = Math.max(answer, secondSum);
        }

        firstSum = 0;
        secondSum = 0;
        for (int i = 0; i < size; i++) {
            firstSum += grid[i][i];
            secondSum += grid[i][size - i - 1];
        }
        answer = Math.max(answer, firstSum);
        answer = Math.max(answer, secondSum);

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] grid = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(size, grid));
    }
}
