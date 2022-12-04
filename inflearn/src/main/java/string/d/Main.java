package string.d;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4.단어 뒤집기
 *
 * 설명
 *  N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *  첫 줄에 자연수 N(3 <= N <= 20)이 주어집니다.
 *
 *  두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다.
 *  단어는 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 *  N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 * 예시 입력1
 * 3
 * good
 * Time
 * Blog
 *
 * 예시 출력1
 * doog
 * emiT
 * giB
 */
public class Main {

    public ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        // 1.전체 뒤집기
        /*for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            answer.add(reversedWord);
        }*/

        // 2.직접 뒤집기
        for (String word : words) {
            char[] alphabetsOfWord = word.toCharArray();
            int lt = 0, rt = word.length() - 1;

            while (lt < rt) {
                char temp = alphabetsOfWord[lt];
                alphabetsOfWord[lt] = alphabetsOfWord[rt];
                alphabetsOfWord[rt] = temp;
                lt++;
                rt--;
            }

            String temp = String.valueOf(alphabetsOfWord);
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int countOfWord = scanner.nextInt();
        String[] words = new String[countOfWord];

        for (int i = 0; i < countOfWord; i++) {
            words[i] = scanner.next();
        }

        for (String word : main.solution(words)) {
            System.out.println(word);
        }
    }
}
