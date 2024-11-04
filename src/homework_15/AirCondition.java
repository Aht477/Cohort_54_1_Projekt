package homework_15;

public class AirCondition {
    String weight;
    String breadth;
    String color;
    String manufacturer;

    public AirCondition(String acWeight, String acBreadth, String acColor, String acManufacturer) {
        this.weight = acWeight;
        this.breadth = acBreadth;
        this.color = acColor;
        manufacturer = acManufacturer;
    }
    public void acHeat() {
        System.out.println("I make hot");
    }

    public void acCool() {
        System.out.println("I make cold");
    }

    public void acVentilated() {
        System.out.println("I make comfortable");
    }
    public void infoAC() {
        System.out.printf("acWeight %s, acBreadth %s, acColor %s, acManufacturer %s\n", weight, breadth, color, manufacturer);
    }
}

