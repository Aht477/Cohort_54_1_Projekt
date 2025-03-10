package homework_44.Task_1;

/*
Task 1
Дан файл payments.txt.txt:

Copy
Ваша задача используя классы пакета java.io
1 - создать файл с именем 'copy.txt.txt' и
2 - скопировать в него все данные из файла 'payments.txt.txt'
 */

import java.io.*;

public class Task_1 {
    public static void main(String[] args) throws IOException {

        File copyFilePath = new File("src/homework_44/Task_1/copy.txt");
        copyFilePath.createNewFile();
        // Код чтения из каждого файла

        // открываем поток чтения
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/homework_44/Task_1/payments.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(copyFilePath))) {
            // считываем строку из файла
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Файл скопирован");

        }
                  catch (FileNotFoundException e) {
            System.err.println("Файл для чтения не найден Exeption: " + e.getMessage());
                   // throw new RuntimeException(e);
                } catch (IOException e) {
            System.err.println("Копирование не удалось: " + e.getMessage());
            //throw new RuntimeException(e);
                }
    }


}

