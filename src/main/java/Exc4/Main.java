package Exc4;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    Student st1 = new Student.Builder().setIndex("23645").setName("jack").setSurname("cash").setMarks(2.0,4.5,5.0).build();
    Student st2 = new Student.Builder().setIndex("23235").setName("joe").setSurname("cole").setMarks(2.0,3.2,1.0).build();
    Student st3 = new Student.Builder().setIndex("22345").setName("brent").setSurname("nash").setMarks(2.0,3.5,4.0).build();
    Student st4 = new Student.Builder().setIndex("23634").setName("travis").setSurname("yound").setMarks(5.0,5.5,5.0).build();

      Dziennik studentBook = new Dziennik();
      studentBook.addStudent(st1);
      studentBook.addStudent(st2);
      studentBook.addStudent(st3);
      studentBook.addStudent(st4);

        System.out.println(studentBook.avg("23645"));;

        studentBook.mapOfStudents.forEach((h,w)-> System.out.println(w));

        System.out.println(studentBook.printOutStudent("23645"));;


        System.out.println(studentBook.mapOfStudents.get("23235"));
        System.out.println();
        System.out.println("removing a student");
        studentBook.removeStudent(st4);
        studentBook.mapOfStudents.forEach((h,w)-> System.out.println(w));
        System.out.println();
        System.out.println("removing student by an index");
        studentBook.removeStudentByIndex("23235");
        studentBook.mapOfStudents.forEach((h,w)-> System.out.println(w));
        System.out.println();
        System.out.println("all back again");
        studentBook.addStudent(st1);
        studentBook.addStudent(st2);
        studentBook.addStudent(st3);
        studentBook.addStudent(st4);
        studentBook.mapOfStudents.forEach((h,w)-> System.out.println(w));
        System.out.println();
        System.out.println("computing average of marks");
        System.out.println(studentBook.avg("22345"));
        System.out.println();
        System.out.println("endangered students");
        studentBook.endangeredStudents(3.2).forEach((h)-> System.out.println(h));


    }
}
