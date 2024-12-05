package homework_23.Task_01;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {

    }

    @Override
    public double figureArea() {
            double figureArea = width * height;
            System.out.println("Rectangle Area is: " + figureArea);
            return figureArea;

        }

        @Override
        public double figurePerimeter () {
        double rectanglePerimeter = (width + height) * 2;
            System.out.println("Rectangle Perimeter is: " + rectanglePerimeter);
            return rectanglePerimeter;

        }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    }


