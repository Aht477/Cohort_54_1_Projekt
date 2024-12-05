package homework_20;
/*
Класс Main

• В методе main создайте объекты классов Rectangle и Circle. • Установите значения для их полей с помощью соответствующих методов.
• Установите имя фигуры, используя поле name, унаследованное от класса Shape. • Вызовите метод displayInfo() и методы вычисления
площади для каждого объекта, чтобы вывести информацию о фигуре и её площади.
 */



public class  Main extends Shape {
    public Main(String name, String color) {
        super(name, color);
    }

    public static void main(String[] args) {

                Rectangle rectangle = new Rectangle("Прямоугольник", "Red");

                rectangle.setDimensions(5.5, 7.43);

                rectangle.displayInfo();
                rectangle.calculateArea();

                Rectangle rectangle1 = new Rectangle("Rectangle", "Yellow", 10, 20);
                rectangle1.displayInfo();
                rectangle1.calculateArea();


                System.out.println("Circle");

                Circle circle = new Circle("Circle", "Blue", 1);
                circle.setRadius(10);
                circle.displayInfo();
                circle.calculateArea();




            }
        }

