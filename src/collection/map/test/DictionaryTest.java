package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = " ";
        String value = " ";

        Map<String, String> dictionary = new HashMap<>();

        System.out.println("==단어 입력 단계==");

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            key = scanner.nextLine();
            if (key.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            value = scanner.nextLine();
            dictionary.put(key, value);
        }

        System.out.println("==단어 검색 단계==");

        String input = " ";

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            key = scanner.nextLine();
            if (key.equals("q")) {
                break;
            }
            if (!dictionary.containsKey(key)) {
                System.out.println(key + "은(는) 사전에 없는 단어입니다.");
            } else {
                System.out.println(key + "의 뜻: " + dictionary.get(key));
            }

        }

    }
}
