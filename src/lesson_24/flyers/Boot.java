package lesson_24.flyers;

public class Boot extends Transport implements Swimmable{


    public Boot(int capasity) {
        super(capasity);
    }

    @Override
    public void swim() {
        System.out.println("Boot swimmt");
    }

    @Override
    void takePassengers() {
        System.out.println("Boat take passengers");
        capasity++;
    }
}
