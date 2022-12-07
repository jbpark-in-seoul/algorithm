package string.k;

import java.util.Scanner;

/**
 * 11.문자열 압축
 *
 * 설명
 *  알파벳 대문자로 이루어진 문자열을 입력 받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *  문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *  단, 반복 횟수가 1인 경우 생략합니다.
 *
 * 입력
 *  첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 *  첫 줄에 압축된 문자열을 출력한다.
 *
 * 예시 입력1
 *  KKHSSSSSSSE
 *  KSTTTSEEKFKKKDJJGG
 *
 * 예시 출력1
 *  K2HS7E
 *  KST3SE2KFK3DJ2G2
 */
public class Main {

    public String solution(String text) {
        StringBuilder answer = new StringBuilder();
        text = text + " ";
        int count = 1;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                answer.append(text.charAt(i));
                if (count > 1) {
                    answer.append(count);
                    count = 1;
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        System.out.printf(main.solution(text));
    }
}
