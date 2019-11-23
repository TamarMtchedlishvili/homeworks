package btu;

import java.util.ArrayList;
import java.util.List;

public class Crud {
    public static List GetDoubleRangeNumber(Double a, Double b, Double step){
        List<Double> arr = new ArrayList<Double>();
        try {
            double result;
            while (a < b ){
                result = Math.exp(a) + 2 * a + 3;
                arr.add(result);
                a += step;
            }
            return arr;
        }catch (Exception e){
            System.out.println("Error in" + e.getLocalizedMessage());
        }
        return arr;
    }
    public static double GetMaxNumber(List<String> numbers){
        try{
            double min = 0.0;
            for(String s: numbers){
                double i = Double.parseDouble(s);
                if(min < i){
                    min = i;
                }
            }
            return min;
        }catch (Exception e){
            System.out.println("Error in " + e.getLocalizedMessage());
        }
        return 0;
    }
    public static double GetMinNumber(List<String> numbers){
        try{
            double min = GetMaxNumber(numbers);
            for(String s: numbers){
                double i = Double.parseDouble(s);
                if(min > i){
                    min = i;
                }
            }
            return min;
        }catch (Exception e){
            System.out.println("Error in " + e.getLocalizedMessage());
        }
        return 0;
    }
}
