import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(4);

        myLinkedList.removeFirst();
        myLinkedList.printList();
        int a = 2;

       myLinkedList.remove(a);
       myLinkedList.remove((Object) 4);
       myLinkedList.printList();
    }
}
