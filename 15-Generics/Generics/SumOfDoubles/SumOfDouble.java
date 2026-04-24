package Generics.Three;

import java.util.*;
public class SumOfDouble {

    public static double sumNumber(List<? extends Number> list){
        double sum=0.0;

        for(Number num : list){
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(10,20,30);
        System.out.println("Sum of Integer :- "+sumNumber(intList));

        List<Double> doubleList = Arrays.asList(5.5,2.5,1.0);
        System.out.println("Sum of Doubles :- "+sumNumber(doubleList));
    }
}