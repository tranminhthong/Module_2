public class Queue {
    public Node front;
    public Node rear;
    public int num;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
        }
        this.rear.link = temp;
        this.rear = temp;
        num++;
    }

    public Node deQueue() {
        Node temp = this.front;
        if (this.front == null)
            return null;
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear = this.front.link;
        }
        num--;
        return temp;
    }

    public void displayQueue() {
        Node temp = front;
        System.out.println("\nElements in Circular Queue are: ");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ",temp.data);
            temp = temp.link;
        }
    }

    class Node {
        public int data;
        public Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }
}
