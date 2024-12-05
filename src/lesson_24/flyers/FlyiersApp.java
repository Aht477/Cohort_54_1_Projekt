package lesson_24.flyers;

public class FlyiersApp {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(15);
        Flyable duck = new Duck();
        Swimmable boat = new Boot(50);


        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();

            if (flyable instanceof Airplane) {
                Airplane airplane1 = (Airplane) flyable;
                airplane1.takePassengers();
                System.out.println("kolichestvo passagirov na bortu." + airplane1.countPassengers());

                System.out.println("=============================");

                Transport[] transports = {airplane, (Transport) boat};
                for (i = 0; i < transports.length; i++) {
                    Transport transport = transports[i];
                    transport.takePassengers();
                    if (transport instanceof Flyable) {
                        Flyable fliable = (Flyable) transport;
                        fliable.fly();
                    }

                    if (transport instanceof Swimmable) {
                        Swimmable swimmable = (Swimmable) transport;
                        swimmable.swim();
                    }
                }

            }
        }
    }
}


