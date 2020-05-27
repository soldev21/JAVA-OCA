package az.oca.main.oop.inheritance;

public abstract class Shape implements ShapeInterface{

    private String name;

    public Shape(String name){
        setName(name);
    }


    public abstract float area();

    public void someDefaultMethod(){
        System.out.println("Default method in Shape class.");
    }

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

        Shape circle = new Circle(5,"circle");
        Shape square = new Square(5,"square");
        System.out.println(square.area());
        square = circle;
        System.out.println(square.area());
//        square.area();
//        Circle circle1 = (Circle) circle;
//        circle.someDefaultMethod();
//        System.out.println(circle.getName());
//        System.out.println(circle.area());
//        Circle.staticMethod();
//        circle.staticMethod();
////        circle.methodOfCircle();
//        circle.draw();
//        circle.draw1();
//        circle.fill();
//
//        Square square = new Square(5,"square");
//        System.out.println(square.area());
//        square.draw();
//        square.draw1();
//        square.fill();
//
//        Drawable.doSomeStuff();
//        System.out.println(Drawable.a);
    }
}
