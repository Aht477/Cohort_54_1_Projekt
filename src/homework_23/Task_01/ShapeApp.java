package homework_23.Task_01;

import java.util.Arrays;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("========circle=======");
        circle.figureArea();
        circle.figurePerimeter();
        System.out.println("=======rectangle======");

        Rectangle rectangle = new Rectangle(7, 3);
        rectangle.figureArea();
        rectangle.figurePerimeter();

        System.out.println("======triangle======");
        Triangle triangle = new Triangle(6, 8, 7);
        triangle.figureArea();
        triangle.figurePerimeter();
        System.out.println("==========================");

        double totalArea = 0;
        Shape[] shapes = new Shape[]{new Circle(), new Rectangle(), new Triangle()};
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].figureArea();

            System.out.println(totalArea);
        }

    }

}
