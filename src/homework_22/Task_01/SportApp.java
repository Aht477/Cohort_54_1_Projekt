package homework_22.Task_01;

public class SportApp {
    public static void main(String[] args) {

        SportsmanAmateur sportsmanAmateur = new SportsmanAmateur();
        sportsmanAmateur.run();
        sportsmanAmateur.pause();

        System.out.println("====================================");
        SportsmanProfessional sportsmanProfessional = new SportsmanProfessional();
        sportsmanProfessional.run();
        sportsmanProfessional.pause();

        System.out.println("========================================");
        Man man = new Man();
        man.run();
        man.pause();


    }
}
