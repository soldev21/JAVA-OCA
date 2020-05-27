package az.oca.main.oop.inheritance;

public interface Drawable {

    int a = 5;

    static void doSomeStuff(){
        System.out.println("This is public static method");
    }

    void draw();
    void same();

    default void draw1(){
        draw();
    }
}
