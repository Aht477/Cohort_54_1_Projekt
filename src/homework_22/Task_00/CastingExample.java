package homework_22.Task_00;

public class CastingExample {
    public static void main(String[] args) {




        Cat cat = new Cat();
        Animal animal = cat;
        Animal animal1 = new Cat();

        animal1.voice();;
        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();

        Animal[] animals = new  Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
        System.out.println("\n =============DownCasting=============");

        Cat catLink;
        Animal animalLink = new Cat();

        catLink = (Cat) animalLink;
        catLink.eat();

        for (int i=0; i< animals.length;i++){
            Animal courrent = animals[i];
            System.out.println("sout: " + courrent);

            System.out.println("getClass. " + courrent.getClass());

            if (animals[i] instanceof Cat){
                System.out.println(i+ "-iy index mogno besopasno perenesti v Cat");
                Cat tempCat = (Cat) animals[i];
                tempCat.eat();

            }
            System.out.println("===============\n");

        }



    }


}
