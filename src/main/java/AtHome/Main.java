package AtHome;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addNewValue("R");
        myLinkedList.addNewValue("U");
        myLinkedList.addNewValue("G");
        myLinkedList.addNewValue(5);
        myLinkedList.addNewValue("Y");

        System.out.println(myLinkedList.getFirstElement());
        System.out.println(myLinkedList.getElement(1));
        System.out.println(myLinkedList.getElement(2));
        System.out.println(myLinkedList.getElement(3));
        System.out.println(myLinkedList.getElement(4));


    }
}
