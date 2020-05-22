package az.oca.main.oop;

public class EqualsPlayground {
    public static void main(String[] args) {
        Human h = new Human("Heyder");
        Human s = new Human("Heyder");

        h.setHeight(175);
        s.setHeight(175);

        System.out.println(h==s);
        System.out.println(h.equals(s));
    }
}
