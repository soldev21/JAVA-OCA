package az.oca.main.oop;

import org.w3c.dom.html.HTMLImageElement;

public class Human {

    public static double eyeCount = 0.0d;



    private String name;
    private int height;
    private String hairColor;
    private String eyeColor;

    // Explicit declaration of  Default constructor
    public Human(){
    }

    public Human(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void greeting(){
        System.out.println("Hello "+name+" with eyeCount "+eyeCount);

    }

    public static void greetingStatic(String name,int age){
        System.out.println("Hello "+name+" with age "+age);
    }

    @Override
    public String toString(){
        return name;
    }
}
