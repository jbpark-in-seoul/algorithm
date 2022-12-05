package string.f;

import java.util.Scanner;

/**
 * 6.중복 문자 제거
 *
 * 설명
 *  소문자로된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *  중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 입력
 *  첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 *  첫 줄에 중복 문자가 제거된 문자열을 출력합니다.
 *
 * 예시 입력1
 * ksekkset
 *
 * 예시 출력1
 * kset
 */
public class Main {
    public String solution(String text) {
        String answer = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(text.charAt(i)) == i) {
                answer += text.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        System.out.printf(main.solution(text));
    }
}
