package emailApp;

import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private String department;
    private String company;
    private String password;

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email created: " + this.firstname + " " + this.lastname);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);


    }

    private String setDepartment() {
        System.out.println("Set department\nDepartments Codes: \n1) sales\n2) development\n3) accounting\n4) blank");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        String department;
        switch (depChoice) {
            case 1:
                department = "sales";
                break;
            case 2:
                department = "development";
                break;
            case 3:
                department = "accounting";
                break;
            default:
                department = "blank";
        }
        return department;
    }
    private 
}
