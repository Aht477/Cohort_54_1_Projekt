package lesson_24.flyers;

public class Airplane extends Transport implements Flyable{


    public Airplane(int capasity) {
        super(capasity);
    }


    @Override
    void takePassengers() {
        System.out.println("Airplane take Passengers");
    }

    @Override
    public void fly() {
        System.out.println("Airplane flynge");
    }
}
