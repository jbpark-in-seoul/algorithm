package string.g;

import java.util.Scanner;

/**
 * 7.회문 문자열
 *
 * 설명
 *  앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *  문자열이 입력되면 해당 문자열이 회문 문자열일 때 "YES", 회문 문자열이 아니라면 "NO"를 출력하는 프로그램을 작성하세요.
 *  단, 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * 입력
 *  첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력
 *  첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예시 입력1
 * gooG
 *
 * 예시 출력1
 * YES
 */
public class Main {

    public String solution(String word) {
        /*String answer = "YES";

        1.String.charAt() 비교 방식
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                answer = "NO";
            }
        }*/

        // 2.StringBuilder.reverse() 비교 방식
        String answer = "NO";

        String reversedWord = new StringBuilder(word).reverse().toString();
        if (word.equals(reversedWord)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.print(main.solution(word.toUpperCase()));
    }
}
