package homework_38.task_3;

import java.util.*;

/*
Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e

Copy

 */
public class Homework_38_Task_3 {

        public static void main(String[] args) {
//            Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D", "E", "F", "J"));
//            Set<String> set2 = new HashSet<>(List.of("A", "B", "C", "D", "F"));
//            System.out.println(getFirstUniqueChar(set1, set2));
//        }
//    public static Set<String> getFirstUniqueChar(Set<String> set1, Set<String> set2) {
//        Set<String> result = new HashSet<>(set1);
//        result.removeAll(set2);
//        return result;
//    }




           String string = "abcdefj ab,cdf,";
            System.out.println(getFirstUniqueChar(string));
        }
        public static char getFirstUniqueChar(String string) {
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (string.indexOf(chars[i]) == string.lastIndexOf(chars[i])) {
                    return chars[i];
                }
            }
            return ' ';
        }

}
