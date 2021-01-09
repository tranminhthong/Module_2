public class Prime {
    public static void main(String[] args) {
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
            if (check){
                System.out.println(i);
            }
        }
    }
}
