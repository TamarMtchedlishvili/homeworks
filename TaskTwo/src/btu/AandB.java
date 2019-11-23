package btu;
import btu.func;

public class AandB implements func {
    int a;
    int b;
    public AandB(int aNumber, int bNumber){
        a = aNumber;
        b = bNumber;
    }

    @Override
    public void PrintRangeNumber() {
        a++;
        while (a < b){
            System.out.println(a);
            a++;
        }
    }

    @Override
    public void PrintAllDivisor() {
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                System.out.println(i);
            }
        }
    }

    @Override
    public void PrintBDivisor() {
        for(int i = 1; i <= b; i++){
            if(b % i == 0 && checkPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    @Override
    public int MostFreq() {

        return 0;
    }
    private boolean checkPrimeNumber(int num){
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
