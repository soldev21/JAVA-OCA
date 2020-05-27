package az.oca.main.oop.inheritance;

public class Square extends Shape {

    float a;

    public Square(float a,String name) {
        super(name);
        this.a = a;
    }

    @Override
    public float area() {
        return a*a;
    }

    @Override
    public void draw() {
        System.out.println("I am a square.");
    }

    @Override
    public void same() {
        System.out.println("Same method");
    }

    @Override
    public void draw1() {
        System.out.println("Overridden default draw1 method in Square");
    }

    @Override
    public void fill() {
        System.out.println("Filling square.");
    }
}
