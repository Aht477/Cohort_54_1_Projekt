package lesson_17;

public class Cat {
    private String name;
   private int age;
    private int weight;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void satName (String name){
        if (name ==null || name.isEmpty()){
            System.out.println("ne korrektnoe znachenie imeni");
            return;
        }
        this.name = name;
    }
    //setor na vosrast
    public void setAge(int age){
        if (age >= 0 && age < 20){
            //age podhodit - ustanavlivaem svoistva objekta
            this.age = age;
        }
    }
    public void eat(){
        System.out.println("Cat Eating");
        weight ++;
    }

    public String toString () {
        return "Cat" + name +", age:" + age + ", weight:" + weight;
    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }
    public int getWeight (){
        return weight;
    }

}
