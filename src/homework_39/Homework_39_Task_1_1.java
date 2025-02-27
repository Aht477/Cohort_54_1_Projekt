package homework_39;


import java.util.HashMap;
import java.util.Map;

public class Homework_39_Task_1_1 {
    public static void main(String[] args) {
    String text = "Строка для 123456 количества вхождений слов" +
            ".\n Строка для 123456 и теста. и количества слов для проверки";

    // System.out.println(text);
    Map<String, Integer> frequencyMap = frequencyDictionary(text);
    System.out.println(frequencyMap);

}
    public static Map<String, Integer> frequencyDictionary(String text) {
        String[] words = text.split("[\\s.,!?;:]+");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;

    }

}