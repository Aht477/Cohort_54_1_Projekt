package homework_15;

public class TrucksDriver {
    String weight;
    String age;
    String name;
    String height;



    public TrucksDriver(String TruckDriverWeight, String TruckDriverAge, String TruckDriverName, String TruckDriverHeight) {
     weight = TruckDriverWeight;
     age = TruckDriverAge;
     name = TruckDriverName;
     height = TruckDriverHeight;


    }

    public void truckDrived(){
            System.out.println("i drive a truck");
        }

        public void bierTrink() {
            System.out.println("i trink a beer");
        }

        public void walkinkWithDog() {
            System.out.println("i walk with my dog");
        }
        public void infoTruckDriver () {
            System.out.printf("my weight %s, my name %s, my age %s, my height %s", weight, name, age,height);

        }


    }

