import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố muốn in ra: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        System.out.println(number + " số nguyên tố đầu là: ");
        boolean check = true;
        do {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                count++;
                System.out.println(N);
            }
            N++;
        } while (count != number);

    }
}
