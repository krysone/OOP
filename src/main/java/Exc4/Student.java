package Exc4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    /*
    *     - posiadać listę ocen studenta (List<Double>)
    - posiadać (pole) numer indeksu studenta (String)
    - posiadać (pole) imię studenta
    - posiadać (pole) nazwisko studenta

    * */

    private String index;
    private String name;
    private String surname;
    private ArrayList<Double> marks;

    private Student(final String index, final String name, final String surname, final ArrayList<Double> marks) {
        this.index = index;
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }
//    public void compareTo(Student s){
//        if (this.)
//    }

    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    @Override
    public  String toString() {
        return "Student{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static class Builder{
       String index;
       String name;
       String surname;
       ArrayList<Double> marks;


       public Builder setIndex(final String index) {
           this.index = index;
           return this;
       }

       public Builder setName(final String name) {
           this.name = name;
           return this;
       }

       public Builder setSurname(final String surname) {
           this.surname = surname;
           return this;
       }

       public Builder setMarks(final Double... m) {
           ArrayList<Double> marks = new ArrayList<>();
           for (double d: m){
               marks.add(d);
           }
       this.marks = marks;
           return this;
       }
       public Student build(){
           return new Student(index,name,surname,marks);
       }
   }
}


