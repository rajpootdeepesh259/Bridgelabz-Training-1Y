package MapInterface;

import java.util.*;
public class Student {
    static void main(String[] args) {
        Map<String, Double> StudentGrades = new HashMap<>();

        StudentGrades.put("Aman",85.5);
        StudentGrades.put("Riya",92.0);
        StudentGrades.put("karan",76.5);
        StudentGrades.put("Neha",88.0);

        System.out.println("After adding students :- ");
        System.out.println(StudentGrades);

        StudentGrades.put("Riya",95.9);
        System.out.println("\nAfter updating Riya's grade :-");
        System.out.println(StudentGrades);

        StudentGrades.remove("Karan");
        System.out.println("\nAfter removing Karan :-");
        System.out.println(StudentGrades);

        System.out.println("\nStudents sorted alphabetically :-");

        Map<String, Double> sortedMap = new TreeMap<>(StudentGrades);
        for(Map.Entry<String, Double> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}