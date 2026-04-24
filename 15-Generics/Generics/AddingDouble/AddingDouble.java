package Generics.Four;

import java.util.*;
public class AddingDouble {

    public static void copyList(List<? super Number> dest, List<? extends Number> src){

        for(Number num : src){
            dest.add(num);
        }
    }

    static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3);

        List<Number> numList =new ArrayList<>();
        copyList(numList, intList);
        System.out.println("After copying : "+numList);

        List<Double> doubleList = Arrays.asList(2.5,3.5);
        copyList(numList, doubleList);
        System.out.println("After adding doubles :- "+numList);
    }
}