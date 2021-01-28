import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác: ");
        try {
            System.out.println("Cạnh thứ nhất:");
            int a = sc.nextInt();
            System.out.println("Cạnh thứ hai:");
            int b = sc.nextInt();
            System.out.println("Cạnh thứ ba:");
            int c = sc.nextInt();
            new Triangle(a, b, c);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static class Triangle {
        public Triangle(int a, int b, int c) throws Exception {
            if (a <= 0 || b <= 0 || c <= 0 || a + b < c || b + c < a || a + c < b) {
                throw new Exception("Nhập sai");
            }else System.out.println("là 3 cạnh tam giác");
        }
    }
}
