package homework_44.Task_2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

Copy
Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800
Copy
more.txt:

user1:5050
user4:2100
 */
public class Task_2 {
    public static void main(String[] args) throws IOException {
        //less.txt список тех, кому в сумме перечисленно меньше 2000
        File lessFile = new File("src/homework_44/Task_2/less.txt");
        lessFile.createNewFile();

        //more.txt список тех, кому в сумме перечисленно 2000 и больше
        File moreFile = new File("src/homework_44/Task_2/more.txt");
        moreFile.createNewFile();

        //файл с историей поступлений денег на счета пользователей
        File inputFile = new File("src/homework_44/Task_2/payments.txt");

        // Карта для хранения суммы поступлений по каждому пользователю
        Map<String, Integer> userPayments = new HashMap<>();

        // открываем поток чтения
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Разделяем строку на имя пользователя и сумму
                String[] parts = line.split(":");
                String username = parts[0];
                int payment = Integer.parseInt(parts[1]);

                // Обновляем сумму поступлений для пользователя
                userPayments.put(username, userPayments.getOrDefault(username, 0) + payment);
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }


        // Разделяем пользователей по суммам поступлений
        try (BufferedWriter lessWriter = new BufferedWriter(new FileWriter(lessFile));
             BufferedWriter moreWriter = new BufferedWriter(new FileWriter(moreFile))) {


            // Пишем в файл
            for (Map.Entry<String, Integer> entry : userPayments.entrySet()) {
                String username = entry.getKey();
                int payment = entry.getValue();

                if (payment < 2000) {
                    lessWriter.write(username + ":" + payment);
                    lessWriter.newLine();
                } else {
                    moreWriter.write(username + ":" + payment);
                    moreWriter.newLine();
                }
            }
            System.out.println("Обработка данных завершена.");

        } catch (IOException e) {
            System.err.println("Ошибка при записи файлов: " + e.getMessage());
        }


    }

    }

















