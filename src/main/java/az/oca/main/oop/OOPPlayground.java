package az.oca.main.oop;

public class OOPPlayground {
    public static void main(String[] args) {
        int a = 5;
//        Human.eyeCount = 2;
        Human.greetingStatic("Ferid",36);
        Human human; // declaration of human variable of Human type;
        human = new Human(); //assignment new Human object reference to predeclared variable human.
        human.setName("Heydar");

        human.greeting();

        Human human1 = new Human();
        human1.setName("Heydar");
        human1.greeting();

        System.out.println(human.getName());
        System.out.println("height "+ human.getHeight());
        System.out.println(human.eyeCount);

//        human.eyeCount = 5;

        System.out.println(human1.getName());
        System.out.println(human1.eyeCount);

        System.out.println(human);
        System.out.println(human1);
        System.out.println(new Human());
    }
}
