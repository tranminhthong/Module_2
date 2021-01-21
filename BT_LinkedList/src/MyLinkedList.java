public class MyLinkedList {
    private Node head;
    private int numNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public static class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
        numNode++;
    }

    public void removeFirst() {
        Node temp = head;
        head = head.next;
        numNode--;
        Node tail;
        if (head == null) tail = null;
    }

    public MyLinkedList remove(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.next;
            numNode--;
        } else {
            for (int i = 1; i < numNode; i++) {
                temp = temp.next;
                if (i == index - 1) {
                    temp.next = temp.next.next;
                    numNode--;
                }
            }
        }
        MyLinkedList myLinkedList = new MyLinkedList(head.getData());
        temp = head;
        for (int i = 1; i <= numNode; i++) {
            myLinkedList.addLast(temp.next.getData());
            temp = temp.next;
        }
        return myLinkedList;
    }

    public boolean remove(Object data) {

        Node newNode = new Node(data);
        boolean check = false;
        if (head.getData().equals(data)) {
            head = head.next;
            numNode--;
            check = true;
        }
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (data.equals(temp.next.getData())) {
                temp.next = temp.next.next;
                numNode--;
                check = true;
            }
            temp = temp.next;
        }
        if (check) {
            remove(data);
        }
        return check;
    }

    public int getSize() {
        return numNode;
    }

    public void printList() {
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp == null)
                System.out.print("]");
            else System.out.print(", ");
        }
    }
}
