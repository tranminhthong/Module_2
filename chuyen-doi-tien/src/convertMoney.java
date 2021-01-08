import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD muốn quy đổi");
        usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println("Số tiên VND = "+convert);
    }
}
