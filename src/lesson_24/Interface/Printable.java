package lesson_24.Interface;

public interface Printable {

    void print();


    default void defaultMethod () {
        System.out.println("Defaul Method from Interface");
    }
    static void staticMethod (){
        System.out.println("Static method from Interface");
    }
}
