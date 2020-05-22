package az.oca.main.oop.inheritance;

public abstract class Shape {

    private String name;

    public Shape(String name){
        setName(name);
    }

    public abstract float area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void staticMethod(){
        System.out.println("Static method in Shape");
    }

    public static void main(String[] args) {
//        Shape shape = new Shape("shape");
//        System.out.println(shape.getName());
//        System.out.println(shape.area());
//        Shape.staticMethod();

        Circle circle = new Circle(5,"circle5");
        System.out.println(circle.getName());
        System.out.println(circle.area());
        Circle.staticMethod();
        circle.staticMethod();
    }
}
