package az.oca.main.oop.inheritance;

public class Circle extends Shape {

    private static final float PI = 3.14f;
    private float radius;

    public Circle(float radius){
//        super("circle");
//        setRadius(radius);
        this(radius,"circle");
    }

    public Circle(float radius,String name){
        super(name);
        setRadius(radius);
    }

    @Override
    public float area() {
        return PI*radius*radius;
    }

    @Override
    public void someDefaultMethod() {
        super.someDefaultMethod();
        System.out.println("Overridden default method in Circle class.");
    }

    public static void staticMethod(){
        System.out.println("Static method in Circle");
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius<=0) throw new RuntimeException("Radius of circle must be greater than 0 sent value is "+radius);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I am a circle.");
    }

    @Override
    public void same() {
        System.out.println("Same method");
    }

    @Override
    public void draw1() {
        System.out.println("Overridden default draw1 method in Circle");
    }

    @Override
    public void fill() {
        System.out.println("Filling circle.");
    }

    public void methodOfCircle(){
        System.out.println();
    }
}
