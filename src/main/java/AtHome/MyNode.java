package AtHome;

public class MyNode<T> {

    T value;
    MyNode<T> next;


    public MyNode(final T value) {
        this.value = value;
        this.next = null;
    }
}
