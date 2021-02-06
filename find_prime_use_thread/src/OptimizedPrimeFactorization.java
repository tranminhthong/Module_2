public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i < 100; i++) {
            int j = 2;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(i + "@" + getClass().getSimpleName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
