package homework_23.Task_01;

public class Triangle extends Shape{
private double a;
private double b;
private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }


    @Override
    public double figureArea() {
        double triangleArea = (a * b) / 2;
        System.out.println("The area of the Triangle is: " + triangleArea);
        return triangleArea;

    }

    @Override
    public double figurePerimeter() {
        double trianglePerimeter = a + b + c;
        System.out.println("Triangle Perimeter is: " + trianglePerimeter);
        return trianglePerimeter;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
