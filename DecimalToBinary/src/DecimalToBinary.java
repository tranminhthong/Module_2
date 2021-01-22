import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nChoice: \n1.convert \n2.exit");
            int x = scanner.nextInt();
            if (x == 1) {
                convert(binary);
            } else if (x == 2) {
                break;
            }
        }
    }

    private static void convert(Stack<Integer> binary) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a Decimal:  ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num > 0) {
            binary.push(num % 2);
            num = num / 2;
        }
        System.out.print("Binary: ");
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
