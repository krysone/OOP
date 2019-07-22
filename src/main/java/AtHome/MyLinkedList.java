package AtHome;

public class MyLinkedList<T> {
    MyNode<T> head;
    int size = 0;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addNewValue(T value) {
        MyNode<T> newNode = new MyNode<T>(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            MyNode<T> temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public T getFirstElement() {
        return this.head.value;
    }

    public T getElement(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("sorry, element of index: " + index + " does not exist");
        }
        MyNode<T> temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int getSize() {
        return size;
    }
}


