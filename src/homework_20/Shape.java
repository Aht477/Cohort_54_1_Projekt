package homework_20;

public class Shape {/*
Task 1
Иерархия классов “Фигуры”
Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
Базовый класс Shape

• Создайте класс Shape. • Добавьте поле name типа String, которое хранит название фигуры. •
Создайте метод displayInfo(), который выводит на экран значение поля name.



 */
        private String name;
        private String color;

        public Shape(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public void displayInfo() {
            System.out.println("Shape: " + name + ", color: " + color);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
