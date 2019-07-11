package emailApp;

import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private Department department;
    private String company = "ELI";
    private String password;
    private int defaultPassLength = 8;
    private String email;
    private String alternateEmail;
    private String emailSuffix;
    private int mailboxCapacity = 500;

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email created: " + this.firstname + " " + this.lastname);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPassLength);
        System.out.println("Your Password: " + this.password);

        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + emailSuffix();
        System.out.println("Your Email address: " + this.email);

    }

    private String emailSuffix() {
        String emailSuffix = this.department.getName() + "." + "elicompany.com";
        if (this.department == Department.BLANK) {
            return emailSuffix = "elicompany.com";
        }
        return emailSuffix;
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

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public String getEmail() {
        return email;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String newPassword) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeSetup{" +
                "firstname= '" + firstname + '\'' +
                ", lastname= '" + lastname + '\'' +
                ", department= " + department +
                ", company= '" + company + '\'' +
                ", password= '" + password + '\'' +
                ", email= '" + email + '\'' +
                ", mailboxCapacity [mb]= " + mailboxCapacity +
                '}';
    }
}
