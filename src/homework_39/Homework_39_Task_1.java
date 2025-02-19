package homework_39;
/*
Task 1
Частотный словарь слов: Напишите метод, который принимает
строку текста и возвращает Map<String, Integer>, где каждому слову
соответствует количество его вхождений в текст.
 */

import java.util.HashMap;
import java.util.Map;

public class Homework_39_Task_1 {

        public static void main(String[] args) {
            String text = "Напишите частотный словарь слов где метод, который принимает \n" +
                    "строку текста и возвращает Map<String, Integer>, где каждому слову \n" +
                    "соответствует количество его вхождений в текст. частотный словарь слов.";

            Map<String, Integer> frequencyMap = WordsDictionaryMethod(text);
            frequencyMap.forEach((key, value) -> System.out.println(key + ", " + value));
        }

        private static Map<String, Integer> WordsDictionaryMethod(String text) {
            String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
            Map<String, Integer> result = new HashMap<>();
            for (String word : words) {
                Integer amount = result.get(word);
                if (amount == null) {
                    amount = 0;
                }
                amount = amount + 1;
                result.put(word, amount);
            }
            return result;
        }

    }

