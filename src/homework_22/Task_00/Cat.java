package homework_22.Task_00;

public class Cat extends Animal {
    @Override
    public void voice () {
        System.out.println("Cat say MEOU");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }


    public void eat(String food) {
        System.out.println("Cat is eating " + food);
    }
}
