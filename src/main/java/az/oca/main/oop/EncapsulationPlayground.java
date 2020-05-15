package az.oca.main.oop;

public class EncapsulationPlayground {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
//        circle.setRadius(-5);
//        System.out.println(circle.getRadius());


//        float area = Calculator.areaCircle(circle);
//        System.out.println(area);
//        area = Calculator.areaCircle(circle.getRadius());
//        System.out.println(area);
//        Calculator.calcAreaAndSet(circle);
//        System.out.println(circle.getArea());
        int r = 5;
        change(r);
        System.out.println(r);
    }


    private static void change(int r){
        r=6;
    }
}
