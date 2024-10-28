package homework_06;
/*
Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */

public class Homework_06_Task_04 {
    public static void main(String[] args) {

                int a = 8;
                int b = 3;
                boolean result;

                result = (a + b) > 10;
                System.out.println("Result 1: " + result);
                //result1 = (8+3=11)>10 true
                result = (a - b) == 5;
                System.out.println("Result 2: " + result);
                //result2 = (8-3=5) == 5; 5 = 5; true
                result = (a * b) != 24;
                System.out.println("Result 3: " + result);
                //result3 = (8*3=24) != 24; 24 не равно 24 это fals
                result = (a / b) >= 2;
                System.out.println("Result 4: " + result);
                //result4 = (8/3=2,66) >= 2; 2,66 больше 2
                result = !(a % b == 2);
                System.out.println("Result 5: " + result);
                //result5 = ! логическое НЕ меняет значение на противоположное
            }
        }
