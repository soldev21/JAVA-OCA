package az.oca.main.oop;

public class Calculator {

    public static int sum(int a,int b){
        return a+b;
    }

    private static long sum(int a,long b){
        return a+b;
    }

    private static int fac(int n){
        if (n==0 || n==1) return 1;
        return n*fac(n-1);
    }

    private static int fib(int n){
        if (n==1) return 0;
        if (n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        long fac = fac(6);
        long fib = fib(11);
        System.out.println(fib);
    }
}
