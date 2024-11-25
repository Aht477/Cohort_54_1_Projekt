package homework_21.Task_1;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-45825487");

        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver Peter = new BusDriver("Peter", "LN00112255");

        bus.setDriver(Peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());
        System.out.println("\n ==================================\n");

        BusDriver margo = new BusDriver("Margo", "AE-224412154");
        Autobus bus1 = new Autobus(margo,24);

        System.out.println(bus1.toString());

        bus1.installNewAutopilot("AP jpt6");
        System.out.println(bus1.toString());
        margo.setName("Margo-Susanna");
        System.out.println(bus1.toString());

        bus1 = null;
        System.out.println(margo.toString());

        System.out.println(bus.toString());
        bus.setDriver(margo);

        System.out.println(bus.toString());
        System.out.println("===========================\n");

        Passenger passenger = new Passenger("Alex");
        Passenger passenger1 = new Passenger("Max");
        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());

        bus.takePassenger(passenger);
        System.out.println("count pass:" + bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println("count pass:" + bus.getCountPassengers());
        bus.takePassenger(passenger);
        System.out.println("count pass" + bus.getCountPassengers());
    }
}
