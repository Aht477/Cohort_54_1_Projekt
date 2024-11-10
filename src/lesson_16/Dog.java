package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight =weight;

    }
    void info(){
        System.out.println("I am Dog " + name +  ",my weight is:" + weight);
    }
    void eat(){
        System.out.println("I am eatting");
        weight++;

    }
    void  run(){
        // proverit dostatochen li ves sobaki dla soverschenija probegki
        // esli ves slischkom mal, to sobaka dolgna poest pered trenirovkoi

        while (weight<3){
            //wes slischkom mal
            System.out.println("sorry, slischkom hudaja i golodnaja, begat ne mogu");
            System.out.println("nado poest. moi wes seichas:" + weight);
            //kuschaem
            eat();
        }
        System.out.println("I am running");
        weight -=2; //weight = weight -2;
        System.out.println("wes posle trenirovki:" + weight);
        System.out.println("=========================================\n");


        // weight = weight +3; weight+=3;
        // weight = weight *4; weight*=4;
        //weight =weight/5; weight/=5;
    }

}
