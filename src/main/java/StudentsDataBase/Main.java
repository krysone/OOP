package StudentsDataBase;

public class Main {
    public static void main(String[] args) {
/*        Student s1 = new Student();
        Student s2 = new Student();
        s2.payOff();
        s2.showStatus();*/

        Student.UniDataBase uDB = new Student.UniDataBase();
        uDB.getUniDataBase().get(1).payOff();
        uDB.getUniDataBase().get(1).showStatus();

    }
}
