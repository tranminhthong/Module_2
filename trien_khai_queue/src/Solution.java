public class Solution {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(3);
        q.enQueue(3);
        q.enQueue(3);
        q.enQueue(2);
        q.enQueue(1);
        q.displayQueue();
        q.deQueue();
        q.displayQueue();
    }
}
