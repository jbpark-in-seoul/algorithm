package array.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2.보이는 학생
 *
 * 설명
 *  선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
 *  맨 앞에 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
 *  (앞에 서 있는 사람들 보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 * 입력
 *  첫 줄에 정수 N(5<=N<=100,000)이 입력된다.
 *  그 다음 줄에 N명의 학생의 키가 앞에서 부터 순서대로 주어진다.
 *
 * 출력
 *  선생님이 볼 수 있는 최대 학생 수를 출력한다.
 *
 * 예시 입력1
 * 8
 * 130 135 148 140 145 150 150 153
 *
 * 예시 출력1
 * 5
 */
public class Main {

    public int solution(List<Integer> statures) {
        int answer = 1;
        int temp = statures.get(0);
        for (int i = 1; i < statures.size(); i++) {
            if (temp < statures.get(i)) {
                answer++;
                temp = statures.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int countOfPerson = scanner.nextInt();
        List<Integer> statures = new ArrayList<>();
        for (int i = 0; i < countOfPerson; i++) {
            statures.add(scanner.nextInt());
        }

        System.out.println(main.solution(statures));
    }
}
