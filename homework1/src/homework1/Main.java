package homework1;


import java.util.Scanner;



class A {
    public static int x;

    A(){
        System.out.println("Hello");
    }


    public static void method1() {
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
    }

    public static void method2() {
        System.out.println("x+12=" + (x+12));
    }

    public static void method3() {
        if (x % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }


}

class B extends A {
    int y;

    public void m1(){
        Scanner scan = new Scanner(System.in);
        y = scan.nextInt();
    }

    public int m2(){
        return y+x;
    }
}


class Main{
    public static void main(String args[]){
        B s=new B();
        s.method1();
        s.method2();
        s.method3();
        s.m1();
        System.out.println("y+x=" + s.m2());

    }
}


