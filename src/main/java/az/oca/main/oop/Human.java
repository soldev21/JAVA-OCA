package az.oca.main.oop;

import org.w3c.dom.html.HTMLImageElement;

public class Human {

    public static double eyeCount = 0.0d;

    public String name;
    public int height;
    public String hairColor;
    public String eyeColor;

//    // Explicit declaration of  Default constructor
    public Human(){
    }

    public Human(String name){

    }

    public void greeting(){
        System.out.println("Hello "+name+" with eyeCount "+eyeCount);

    }

    public static void greetingStatic(String name,int age){
        System.out.println("Hello "+name+" with age "+age);
    }
}
