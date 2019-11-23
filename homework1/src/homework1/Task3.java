package homework1;

import java.util.Scanner;
import java.util.Random;

class Task3 {
    public static void main(String[] args) {
        task8();
    }

    public static void task8(){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count=0;
        int count2=0;
        int sum=0;
        int sum2=0;
        System.out.println();


        int c=a;

        if (a>b) {
            a=b;
            b=c;
        }

        for (int i=1; i<=40; i++)
        {
            int randomInteger = random.nextInt(b - a + 1) + a;
            System.out.println(randomInteger);


            if (randomInteger%2==0){
                count++;
                sum += randomInteger;


            }

            else {
                count2++;
                sum2 += randomInteger;
            }
        }

        System.out.println("even " + count);
        System.out.println("odd " + count2);
        System.out.println("Sum " + sum);
        System.out.println("Sum " + sum2);
        System.out.println();

        int d=sum;

        if (sum>sum2) {
            sum=sum2;
            sum2=d;
        }

        for (int j=1; j<=5; j++){
            int integer = random.nextInt(sum2 - sum + 1) + sum;
            System.out.println(integer);
        }


    }

}