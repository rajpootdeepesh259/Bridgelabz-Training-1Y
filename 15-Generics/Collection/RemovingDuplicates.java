package Collection;

import java.util.*;
public class RemovingDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list){

        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for(T item : list){
            if(!seen.contains(item)){
                seen.add(item);
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] agrs){
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        List<Integer> result = removeDuplicates(list);
        System.out.println("After removing duplicates :- "+result);
    }
}