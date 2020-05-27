package az.oca.main.oop.inheritance;

public class B extends A{

    String name = "ClassB";

    void setNames(){
        this.name = "Heyder";
        super.name = "Sherif";
    }

    void printNames(){
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
//        B b = new B();
//        b.setNames();
//        b.printNames();
        A a = new B();
        B b = new B();
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
