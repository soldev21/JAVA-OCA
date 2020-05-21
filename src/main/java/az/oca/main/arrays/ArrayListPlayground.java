package az.oca.main.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPlayground {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(16);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(8);

        print(list);

//        list.remove(5);
        list.removeAll(Arrays.asList(7,8));

//        list.add(3,15);

        print(list);

        list.set(1,15);

//        System.out.println(list.get(1));

        print(list);

        list.clear();
        print(list);


    }

    private static void print(List list){
        for(Object o:list){
            System.out.println(o);
        }
        System.out.println();
    }
}
