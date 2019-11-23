package homework1;

import java.util.Scanner;

class C {
    public static int a;
    public static int b;
    public static int c;
    public static int d;



    public static void main(String[] args){
        method1();
        System.out.println("a-ს მნიშვნელობის ბოლო ციფრი "+ method2());
        System.out.println("b-ს მნიშვნელობის პირველ ციფრი " + method3());
        System.out.println("c-ს მნიშვნელობის ციფრთა ჯამი " + method4());
        method5();
        method6();
    }

    public static void method1() {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }

    public static int method2() {
        a = a % 10;
        return a;


    }

    public static int method3() {

        String str = String.valueOf(b);

        int i=0;
        while (i<str.length()-1) {
            b = b / 10;
            i++;

        }
        return b;
    }

    public static int method4() {
        int sum = 0;
        int j = 0;
        String str = String.valueOf(b);

        int i=0;
        while (i<str.length()) {
            j = c % 10;
            sum += j;
            c /= 10;
            i++;

        }
        return sum;
    }

    public static void method5() {
        d = method2() * method3();
        System.out.println(d);

    }

    public static void method6() {
        System.out.println(method3() + d);

    }

}

