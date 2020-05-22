package az.oca.main.oop.inheritance;

public class Circle extends Shape {

    private static final float PI = 3.14f;
    private float radius;

    public Circle(float radius,String name){
        super(name);
        setRadius(radius);
    }

    @Override
    public float area() {
        return PI*radius*radius;
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
}
