public class Test {
    public static void main(String[] args) {
        NumberGenerator ng1 = new NumberGenerator();
        NumberGenerator ng2 = new NumberGenerator();

        Thread t1 = new Thread(ng1);
        Thread t2 = new Thread(ng2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
