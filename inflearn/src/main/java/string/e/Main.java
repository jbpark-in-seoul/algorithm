package string.e;

import java.util.Scanner;

/**
 * 5.특정 단어 뒤집기
 *
 * 설명
 *  영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *  특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *  첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 *  첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력1
 * a#b!GE*T@S
 *
 * 예시 출력1
 * S#T!EG*b@a
 */
public class Main {
    public String solution(String text) {
        String answer = "";
        char[] alphabets = text.toCharArray();
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(alphabets[left])) {
                left++;
            } else if (!Character.isAlphabetic(alphabets[right])) {
                right--;
            } else {
                char temp = alphabets[left];
                alphabets[left] = alphabets[right];
                alphabets[right] = temp;
                left++;
                right--;
            }
        }
        answer = String.valueOf(alphabets);
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        System.out.print(main.solution(text));
    }
}
