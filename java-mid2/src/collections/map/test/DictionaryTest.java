package collections.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.println("영어 단어를 입력하세요 (종료는 'q'): ");
            String word = scanner.next();

            if (word.equals("q")) {
                break;
            }

            System.out.println("한글 뜻을 입력하세요:");
            String meaning = scanner.next();

            dictionary.put(word, meaning);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchWord = scanner.next();

            if (searchWord.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                System.out.println(searchWord +"의 뜻: " + dictionary.get(searchWord));
            }
            else{
                System.out.println(searchWord+ "(는) 사전에 없는 단어 입니다.");
            }
        }
    }
}
