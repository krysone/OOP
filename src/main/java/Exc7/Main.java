package Exc7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student.Builder().setIndex(100400).setName("jake").setSurname("jones").build();
        Student st2 = new Student.Builder().setIndex(100300).setName("joe").setSurname("klein").build();
        Student st3 = new Student.Builder().setIndex(100500).setName("david").setSurname("brody").build();

        Map<Long, Student> studentsMapBER = new TreeMap<>();
        studentsMapBER.put(st1.getIndex(), st1);
        studentsMapBER.put(st2.getIndex(), st2);
        studentsMapBER.put(st3.getIndex(), st3);

        studentsMapBER.entrySet().stream().forEach((h) -> System.out.println(h));

        System.out.println();
        System.out.println("Does the map contain a key 100300 and 100200");
        System.out.println(studentsMapBER.containsKey(100300L));
        System.out.println(studentsMapBER.containsKey(100200L));

        System.out.println();
        System.out.println("Get the student of a particular id no.");
        System.out.println(studentsMapBER.get(100400L));
        ;

        System.out.println();
        System.out.println("Number of students");
        System.out.println(studentsMapBER.size());

        System.out.println();
        System.out.println("Print out all students");
        studentsMapBER.forEach((h, j) -> System.out.println(studentsMapBER.get(h)));//or see above

        System.out.println();
        System.out.println("Print out all students");
        for (Map.Entry<Long, Student> mm : studentsMapBER.entrySet()) {
            System.out.println("Index= " + mm.getKey() + " : " + mm.getValue().getName() +" " + mm.getValue().getSurname());
        }
        System.out.println();
        System.out.println("Print out all students");
        studentsMapBER.values().stream().forEach(a-> System.out.println(a));
        System.out.println();
        System.out.println("Print out all students");
        studentsMapBER.values().forEach(a-> System.out.println(a));

        System.out.println();
        System.out.println("Print out all students but just names");
        studentsMapBER.values().forEach(student -> System.out.println(student.getName()));


/*        Map<Long, Student> treeMap = new TreeMap<>() {

        }*/
    }
}
