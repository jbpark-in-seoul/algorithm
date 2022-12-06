package string.i;

import java.util.Scanner;

/**
 * 9.숫자만 추출
 *
 * 설명
 *  문자와 숫자가 섞여 있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *  만약 "tge0a1h205er"에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수로 만들면 1205가 됩니다.
 *  추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 *  첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 *  첫 줄에 자연수를 출력합니다.
 *
 * 예시 입력1
 *  g0en2T0s8eSoft
 *
 * 예시 출력1
 *  208
 */
public class Main {

    public int solution(String text) {
        String answer = "";

        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                answer += character;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        System.out.print(main.solution(text));
    }
}
