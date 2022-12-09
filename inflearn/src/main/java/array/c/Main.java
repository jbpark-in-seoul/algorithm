package array.c;

import java.util.Scanner;

/**
 * 3.가위바위보
 *
 * 설명
 *  A, B 두 사람이 가위바위보 게임을 합니다.
 *  총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
 *  비길 경우에는 D를 출력합니다.
 *  가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 *  각 회차별 가위바위보 승자를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *  첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 *  두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *  세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 출력
 *  각 줄에 각 회차별 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 예시 입력1
 *  5
 *  2 3 3 1 3
 *  1 1 2 2 3
 *
 * 예시 출력1
 *  A
 *  B
 *  A
 *  B
 *  D
 */
public class Main {

    public String[] solution(int[] numbersOfFirstUser, int[] numbersOfSecondUser, int countOfGame) {
        String[] answer = new String[countOfGame];

        for (int i = 0; i < countOfGame; i++) {
            if (numbersOfFirstUser[i] == numbersOfSecondUser[i]) {
                answer[i] = "D";
            } else if (numbersOfFirstUser[i] == 1 && numbersOfSecondUser[i] == 3) {
                answer[i] = "A";
            } else if (numbersOfFirstUser[i] == 2 && numbersOfSecondUser[i] == 1) {
                answer[i] = "A";
            } else if (numbersOfFirstUser[i] == 3 && numbersOfSecondUser[i] == 2) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int countOfGame = scanner.nextInt();
        int[] numbersOfFirstUser = new int[countOfGame];
        int[] numbersOfSecondUser = new int[countOfGame];

        for (int i = 0; i < numbersOfFirstUser.length; i++) {
            numbersOfFirstUser[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbersOfSecondUser.length; i++) {
            numbersOfSecondUser[i] = scanner.nextInt();
        }

        for (String winner : main.solution(numbersOfFirstUser, numbersOfSecondUser, countOfGame)) {
            System.out.println(winner);
        }
    }
}
