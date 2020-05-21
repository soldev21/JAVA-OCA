package az.oca.main.arrays;

import az.oca.main.oop.Human;

public class OneDimensionalArrayPlayground {
    public static void main(String[] args) {
        int a[] = {8,96,52,3};
        print(a);
        a[0] = 25;
        print(a);



        String s[] = {"Salam","Heyder"};
        print(s);

        Human h[] = {new Human("Heyder"),new Human("Sherif")};
        print(h);
     }

    private static void print(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    private static void print(Object a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
