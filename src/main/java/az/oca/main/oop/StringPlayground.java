package az.oca.main.oop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringPlayground {
    private static final int a[] = {1, 2, 3};

    public static void main(String[] args) {
        a[1] = 5;
        int b = 5;
        String a = "{\n" +
                "  \"minSalary\": 2000,\n" +
                "  \"maxAge\": 25,\n" +
                "  \"category\" : \"operations\"\n" +
                "}";

        String s = new String("foo");
        String ss = "bar";
        String s2 = s + ss;
//        System.out.println(s2);

//        System.out.println("foo" == s);
//        String s1 = new String("foo");
//
//        String s = "foo";
//        String s1 = "foo";
//
//        String se = s.replace('f', 'b');
//
//        String s2 = "boo";
//
//        System.out.println(s);
//        System.out.println(se);
//        System.out.println(s1);
//
//        System.out.println(se == s2);
//        System.out.println(se.equals(s2));
//
//        System.out.println(s == s1);
//        System.out.println(s.equals(s1));
//
////        String aa = "bar";
////        for (int i = 1; i < 11; i++)
////            doSmth(aa);
//
//        /*
//         * check condition
//         * execute body
//         * increment
//         * do again
//         */

//        String s;
//        char[] chars = {'f','o','o'};
//        s = new String(chars);
//        System.out.println(s);

//        StringBuilder builder = new StringBuilder("String Builder");
//        String s1 = builder.toString();
//        String s2 = new String(builder);
//        StringBuffer  buffer = new StringBuffer("String Buffer");
//        String sbf = buffer.toString();
//        String sbff = new String(buffer);
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//        long time = System.currentTimeMillis();
//        concat();
//        System.out.println(System.currentTimeMillis()-time);
//
//        time = System.currentTimeMillis();
//        builder();
//        System.out.println(System.currentTimeMillis()-time);



        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Salam");
        stringBuilder.append(false);
        stringBuilder.append(new Human(" Heyder"));
//        stringBuilder.delete(0,4);
//        stringBuilder.insert(0,"Heyder ");
        System.out.println(stringBuilder.toString());




    }
//
//    private static void doSmth(String c) {
//        String a = "bar";
//        System.out.println(a == c);
//    }

    private static void concat(){
        String sss = "";
        for (int i = 1; i < 100000; i++) {
            sss = sss.concat(String.valueOf(i));
            sss = sss.concat(" ");
        }
    }

    private static void builder(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 100000; i++) {
            stringBuilder
                    .append(i)
                    .append(" ");
        }
    }


}
