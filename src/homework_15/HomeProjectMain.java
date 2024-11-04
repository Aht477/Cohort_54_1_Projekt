package homework_15;

public class HomeProjectMain {
    public static void main(String[] args) {
        System.out.println("==========TruckDriver==========");
        System.out.println("I am a TruckDriver");
        TrucksDriver driver = new TrucksDriver("100", "28", "Mike", "180");
       driver.walkinkWithDog();
       driver.truckDrived();
       driver.bierTrink();
       driver.infoTruckDriver();
        System.out.println();
        System.out.println("======I am a cow ================");
        Cow cow = new Cow("500", "BlackWhite", "10","Isabella");
        cow.eat();
        cow.moo();
        cow.sleep();
        cow.milked();
        cow.infoCow();
        System.out.println();
        System.out.println("==============Air Condition===========");
        AirCondition ac = new AirCondition("10", "120", "white", "USA");
        ac.acCool();
        ac.acHeat();
        ac.acVentilated();
        ac.infoAC();
        System.out.println();
        System.out.println("=====================================");


















    }
}
