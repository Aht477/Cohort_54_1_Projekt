package homework_21.Task_1;

public class Autobus {

    private static int counter;

    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capasity;
    private int countPassengers;
    private final Passenger[] passengers;


    public Autobus(BusDriver busDriver, int capasity){
        this.id = counter++;
        this.driver = busDriver;
        this.capasity = capasity;
        this.autopilot = new Autopilot("AP-v001");
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capasity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (countPassengers < capasity) {
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }
            System.out.printf("В автобусе id: %d свободных мест нет!\n", this.id);
            return false;
        }
        private boolean isPassengerInBus(Passenger passenger) {
        for (int i =0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()){
                return true;
            }
            }
        return false;
    }
    public void updateAutopilotVersion(String softVareversion) {
        this.autopilot.setSoftwareVersion(softVareversion);
    }
    public void installNewAutopilot(String softwareVersion) {
        this.autopilot.setAutobus(null);

        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }


    @Override
    public String toString() {
        return "Autobus: {" +
                "id=" + id + ", capasity=" + capasity +
                ", driver=" + driver.toString() +
                ", autopilot =" + autopilot.toString() +

                '}';
    }
    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capasity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
