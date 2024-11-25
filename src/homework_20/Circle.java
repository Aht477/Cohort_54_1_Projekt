package homework_20;
/*

Класс Circle (Круг)

• Создайте класс Circle, который наследуется от Shape. • Добавьте поле radius типа double, которое хранит радиус круга.
• Создайте метод setRadius(double radius), который устанавливает значение поля radius. • Создайте метод calculateArea(),
который вычисляет и выводит площадь круга.

 */

public class Circle extends Shape {

    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return Math.PI * (radius * radius);

    }

    public double getRadius() {
        return radius;
    }

}
