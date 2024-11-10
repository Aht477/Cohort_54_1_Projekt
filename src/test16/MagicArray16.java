package test16;

public class MagicArray16 {
        int[] array;
        int cursor; // присвоено значение по умолчание - 0;
        public MagicArray16() {
            array = new int[10];
        }
        // Добавление в массив одного элемента
        void add(int value) {
            // Проверка. Есть ли свободное места во внутреннем массиве
            // Если места нет - нужно добавить место
            if (cursor == array.length - 1) {
                // Курсор указывает на последнюю свободную ячейку
                // Расширить массив перед добавлением нового элемента
                expandArray();
            }
            array[cursor] = value;
            cursor++;
        }
        // Динамическое расширение массива
        void expandArray() {
            System.out.println("Расширяем массив! cursor: " + cursor);
        /*
        1. Создать массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */
            // 1.
            int[] newArray = new int[array.length * 2];
            // 2
            for (int i = 0; i < cursor; i++) {
                newArray[i] = array[i]; // Переписываю все значения из старого массива
            }
            // 3. Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
            array = newArray;
            System.out.println("Расширение массива завершено");
        }
        void addAll(int... values) {
            // с values я могу обращаться точно также, как со ссылкой на массив int
//        System.out.println("Мы приняли несколько int-ов. А именно: " + values.length);
//        System.out.println("У каждого значения есть индекс. По индексом 0: " + values[0]);
            for (int i = 0; i < values.length; i++) {
                add(values[i]);
            }
        }
        // Удаление элемента по индексу
        int remove(int index) {
        /*
        1. Проверить валидность индекса (что он не отрицательный и меньше курсора
        2. Запомнить, какое значение находилось под этим индексом
        3. Удалить значение из ячейки
        4. Передвинуть все элементы за индексом на 1 ячейку влево
        5. Передвинуть курсор влево
        6. Вернуть старое значение
         */
            if (index < 0 || index >= cursor) {
                // Индекс не валидный. Ничего в массиве не трогаем
                return Integer.MIN_VALUE; // Todo переписать потом
            }
            // 2. Запомнить значение
            int value = array[index];
            // 3, 4
            // индекс 11, курсор = 12
            //for (int i = 11; i <  12 - 1; i++) {
            for (int i = index; i <  cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            // 5.
            cursor--;
            return value;
        }
        // Текущее количество элементов в массиве
        int size() {
            return cursor;
        }
        // Возвращает строковое представление массива
        // [100, 200, 500]
        public String toString() {
        /*
        Открыть скобочку.
        Перебрать элементы.
        Добавить каждый элемент, добавить запятую (если элемент не последний)
        Закрыть скобочку
         */
            if (cursor == 0) return "[]";
            String result = "[";
            for (int i = 0; i < cursor; i++) {
                result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
            }
            return result;
        }
    }
/*
1. Добавлять в массив элементы (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы там есть) ++
4. Добавляем в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу get(int index) ??
7. Удалять элемент по индексу (Если индекс есть - удалит элемент - вернет удаленное значение) ++
8. Поиск элемента по значению indexOf(int value) (определить есть ли в массиве элемент с таким значением) ??
9. Удалять элемент по значению boolean removeByValue(int value) (Если значение есть - удалит элемент - вернет true, если такое значение было) ++
 */

