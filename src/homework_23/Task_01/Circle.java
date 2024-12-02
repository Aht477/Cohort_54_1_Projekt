package homework_23.Task_01;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double figureArea() {
        double circleArea = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + circleArea);
        return circleArea;

    }

    @Override
    public double figurePerimeter() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference is: " + circumference);
        return circumference;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
