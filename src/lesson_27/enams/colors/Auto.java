package lesson_27.enams.colors;

public class Auto {
    private String model;

    //private String color;
    private Color color;

    public Auto(Color color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color=" + color +
                ", model='" + model + '\'' +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
