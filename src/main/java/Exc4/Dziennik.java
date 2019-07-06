package Exc4;

import java.util.*;

public class Dziennik {

    /*
    * Klasa Dziennik powinna:
    - posiadać (jako pole) mapę Studentów.  //#(co powinno być kluczem?)
    - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
    - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
    - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta,
    *  a w wyniku zwraca konkretnego studenta.
    - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
    - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
    - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów,
    * a następnie zwraca posortowaną listę.

    * */

    Map<String, Student> mapOfStudents = new HashMap();
    Student student;

    @Override
    public String toString() {
        return "\nStudent{" +
                "index='" + student.getIndex() + '\'' +
                ", name='" + student.getName() + '\'' +
                ", surname='" + student.getSurname() + '\'' +
                ", marks=" + student.getMarks() +
                "}\n";
    }


    public void addStudent(Student student) {
        mapOfStudents.put(student.getIndex(), student);
    }

    public void removeStudent(Student student) {
        mapOfStudents.remove(student.getIndex(), student);
    }

    public void removeStudentByIndex(String index) {
        mapOfStudents.remove(index);
    }

    public String printOutStudent(String index) {
        mapOfStudents.get(index);
        return mapOfStudents.get(index).toString();
    }

    public Double avg(String index) {
        List<Double> studentMarks = mapOfStudents.get(index).getMarks();
        OptionalDouble avg = studentMarks.stream().mapToDouble(a -> a).average();
        return avg.isPresent() ? avg.getAsDouble() : 0;
    }

    public ArrayList<Student> endangeredStudents(double threshold) {
        ArrayList<Student> endangSt = new ArrayList<>();
        for (Map.Entry<String, Student> mm : mapOfStudents.entrySet()) {
            double average = avg(mm.getKey());
            if (average < threshold) {
                endangSt.add(mm.getValue());
            }
        }
        return endangSt;

    }
}
