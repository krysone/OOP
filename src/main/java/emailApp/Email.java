package emailApp;

import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private Department department;
    private String company;
    private String password;
    private int defaultPassLength = 8;

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email created: " + this.firstname + " " + this.lastname);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPassLength);
        System.out.println("Your Password: " + this.password);
    }

    private Department setDepartment() {
        Department department = Department.BLANK;
        System.out.println("Please set department\nDepartments Codes: \n1) Sales\n2) Development\n3) Accounting\n4) Blank");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int depChoice = in.nextInt();
            switch (depChoice) {
                case 1:
                    return department = Department.SALES;
                case 2:
                    return department = Department.DEVELOPMENT;
                case 3:
                    return department = Department.ACCOUNTING;
                default:
                    return department = Department.BLANK;
            }
        }
        return department;
    }

    public String randomPassword(int passwordLength) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789!@$%^&*";
        char[] pass = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(rand);
        }
        return new String(pass);
    }


}
