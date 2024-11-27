package homework_22.Task_01;

public class SportsmanAmateur extends Man{

    @Override
    public void run() {
        System.out.println("A SportsmanAmateur rant at speed 15 km/h ");
    }

    @Override
    public void pause() {
        System.out.println("A SportsmanAmateur make a pause 10 minutes");
    }
}
