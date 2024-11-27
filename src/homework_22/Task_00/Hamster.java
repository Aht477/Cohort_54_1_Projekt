package homework_22.Task_00;

public class Hamster extends Animal {

    @Override
    public void voice() {
        //super.voice();
        System.out.println("hamster voice hrum hrum");

    }

    @Override
    public String toString() {
        return super.toString() + " hamster . dopolnenie realisazii roditelskogo metoda";
    }
}
