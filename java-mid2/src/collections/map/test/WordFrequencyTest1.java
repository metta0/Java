package collections.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] textArr = text.split(" ");
        Map<String, Integer> textMap = new HashMap<>();
        for (String word : textArr) {
            textMap.put(word, textMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(textMap);
    }
}
