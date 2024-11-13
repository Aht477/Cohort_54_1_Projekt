package StaticBlockDemo;

public class StaticBlockDemo {
    static String[] colors;
    static int counter = 5;

    //static inizialisations block
    static {
        System.out.println("Static Block run");
        colors = new  String[3];
        colors[0] = "red";
        colors[1] = "yellow";
        colors[2] = "green";

    }

    //no static block initialisation
    {
        System.out.println("NON Static block run");
        this.title = "BlockTitle";

    }

    private String title;
    private  int capasity = 10;

    public  StaticBlockDemo(String title){
        this.title =title;

    }

    public String toString() {
        return String.format("Title %d, capasity %d, static - counter %d", title,capasity, counter);

    }
}
