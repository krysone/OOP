package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Jack", "Jones");
        email1.setAlternateEmail("dsdcsdconc");
        System.out.println(email1.getAlternateEmail());
        System.out.println(email1.toString());
    }
}
