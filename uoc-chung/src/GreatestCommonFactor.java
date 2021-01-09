import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            int c = a;
            int d = b;
            while (c != d) {
                if (c > d) {
                    c -= d;
                } else {
                    d -= c;
                }
            }
            System.out.println("Greatest common factor: " + c);
        }
    }
}
