package lesson_24.flyers;

public abstract class Transport {
    int capasity;

    public Transport(int capasity) {
        this.capasity = capasity;
    }
    abstract void takePassengers();
    public int countPassengers(){
        return capasity;
    }
}
