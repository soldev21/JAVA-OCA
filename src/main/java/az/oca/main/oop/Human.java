package az.oca.main.oop;

public class Human {

    public static double eyeCount = 0.0d;

    public String name;
    public int height;
    public String hairColor;
    public String eyeColor;

    // Explicit declaration of  Default constructor
    public Human(){
    }

    public void greeting(){
        System.out.println("Hello "+name+" with eyeCount "+eyeCount);
    }

    public static void greetingStatic(){
        System.out.println("Count of eyes of Human is "+eyeCount);
    }
}
