package homework_22.Task_01;

public class SportsmanProfessional extends Man {

    @Override
    public void pause() {
        System.out.println("A SportsmanProfessional rant at speed 25 km/h ");
    }

    @Override
    public void run() {
        System.out.println("A SportsmanProfessional make a pause 5 minutes");
    }
}
