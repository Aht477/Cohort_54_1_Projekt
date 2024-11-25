package homework_20;
/*
Класс Rectangle (Прямоугольник)

• Создайте класс Rectangle, который наследуется от Shape. • Добавьте поля width и height типа double,
которые хранят размеры прямоугольника. • Создайте метод setDimensions(double width, double height),
который устанавливает значения полей width и height. • Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.

 */

public class Rectangle extends Shape {

    private double width;
    private double height;

    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(double width, double height){
        return width * height;

    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }




    }

