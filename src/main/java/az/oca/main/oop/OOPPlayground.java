package az.oca.main.oop;

public class OOPPlayground {
    public static void main(String[] args) {
        int a = 5;
//        Human.eyeCount = 2;
        Human.greetingStatic();
        Human human = new Human();
        human.name = "Heydar";
        human.greeting();

        Human human1 = new Human();
        human1.name = "Sherif";
        human1.greeting();

        System.out.println(human.name);
        System.out.println("height "+ human.height);
        System.out.println(human.eyeCount);

//        human.eyeCount = 5;

        System.out.println(human1.name);
        System.out.println(human1.eyeCount);

        System.out.println(human);
        System.out.println(human1);
        System.out.println(new Human());
    }
}
