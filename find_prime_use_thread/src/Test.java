public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();
        Thread t1 = new Thread(lpf);
        Thread t2 = new Thread(opf);
        t1.start();
        t2.start();
    }
}
