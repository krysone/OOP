package StudentsDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    public static int id = 1201;
    private String personalId;
    private List<CourseType> coursesEnrolled;
    private int balance;

    public Student() {
        setName();
        this.name = getName();
        setSurname();
        this.surname = getSurname();
        id++;
        setId();
        this.personalId = getPersonalId();
        setCoursesEnrolled();
        this.coursesEnrolled = getCoursesEnrolled();
        setBalance();
        this.balance = getBalance();
        System.out.println(this.name + " : "
                + this.surname + " : "
                + this.personalId + " : "
                + this.coursesEnrolled + " : "
                + this.balance + " balance[Total] ");
    }

    public List<Student> createDB() {
        System.out.println("please type in how many students you intend to enter?");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        System.out.println("Thank you");
        List<Student> studentsList = new ArrayList<Student>();
        return studentsList;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Please enter the name of the student: ");
        Scanner in = new Scanner(System.in);
        this.name = in.next();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        System.out.print("Please enter the surname of the student: ");
        Scanner in = new Scanner(System.in);
        this.surname = in.next();
    }

    public String getPersonalId() {
        return personalId;

    }

    public void setId() {
        System.out.print("Please enter the year of the student: ");
        Scanner in = new Scanner(System.in);
        String idPrefix = in.next();
        String personalId = idPrefix + String.valueOf(Student.id);
        this.personalId = personalId;
    }

    public List<CourseType> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled() {
        List<CourseType> coursesEnrolled = new ArrayList<CourseType>();
        Scanner in = new Scanner(System.in);
        int courseCode;
        do {
//            in.nextInt();
            System.out.println("Please choose courses to enroll");
            System.out.println("To finish enter '0'");
            System.out.println("Course Codes: \n1 -> History\n2 -> Mathematics\n3 -> English\n4 -> Chemistry\n5 -> Computer Science");
            courseCode = in.nextInt();
            if (courseCode == 1) {
                coursesEnrolled.add(CourseType.HISTORY);
                System.out.println("enrolled for History");

            } else if (courseCode == 2) {
                coursesEnrolled.add(CourseType.MATHEMATICS);
                System.out.println("enrolled for Mathematics");

            } else if (courseCode == 3) {
                coursesEnrolled.add(CourseType.ENGLISH);
                System.out.println("enrolled for English");

            } else if (courseCode == 4) {
                coursesEnrolled.add(CourseType.CHEMISTRY);
                System.out.println("enrolled for Chemistry");

            } else if (courseCode == 5) {
                coursesEnrolled.add(CourseType.COMPUTER_SCIENCE);
                System.out.println("enrolled for Computer Science");

            } else if (courseCode == 0) {
                System.out.println("Thank you");
                break;
            } else {
                System.out.println("Don't understand");
                System.out.println("Please choose number from 0 to 5");

            }
        } while (courseCode != 0);
        this.coursesEnrolled = coursesEnrolled;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance() {
        int balance = getBalance();
        for (CourseType e : getCoursesEnrolled()) {
            balance = balance - e.getCost();
        }
        this.balance = balance;
    }

    public void payOff() {
        System.out.println("How much do you wanna pay");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        System.out.println("Thank you for your payment of $" + payment);
        int currentBalance = getBalance() + payment;
        this.balance = currentBalance;
    }

    public void showStatus() {
        System.out.println(this.name + " : "
                + this.surname + " : "
                + this.personalId + " : "
                + this.coursesEnrolled + " : "
                + this.balance + " balance[Total] ");
    }

    public static class UniDataBase {
        private List<Student> uniDataBase;

        public UniDataBase() {
            setUniDataBase();
            this.uniDataBase = getUniDataBase();
        }

        public List<Student> getUniDataBase() {
            return uniDataBase;
        }

        public void setUniDataBase() {

            System.out.println("Hi, how many students do you want to enter?");
            Scanner in = new Scanner(System.in);
            List<Student> uniDataBase = new ArrayList<>();
            int numberStudents = in.nextInt();
            System.out.println("Thank you");
            System.out.println("You're going to create data base for " + numberStudents + " students");
            for (int i = 0; i < numberStudents; i++) {
                uniDataBase.add(new Student());
                System.out.println(uniDataBase.get(i).name
                        + " " + uniDataBase.get(i).surname
                        + " " + uniDataBase.get(i).personalId
                        + " has been added to your DB");
            }
            this.uniDataBase = uniDataBase;
        }
    }
}
