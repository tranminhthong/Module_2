import java.util.Arrays;
import java.util.Stack;

public class Array_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack ban đầu: "
                + stack);
        int[] IntegerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng số nguyên ban đầu: "
                + Arrays.toString(IntegerArray));
        for (int j : IntegerArray) {
            stack.push(j);
        }
        System.out.println("Stack sau khi push: " + stack);
        for (int i = 0; i < IntegerArray.length; i++) {
            IntegerArray[i] = stack.pop();
        }
        System.out.println("Mảng số nguyên sau khi đảo: "
                + Arrays.toString(IntegerArray));

        for (int i = 0; i < 30; i++) {
            System.out.print("---");
        }

        Stack<Character> stack1 = new Stack<>();
        StringBuilder string = new StringBuilder("CodeGym");
        System.out.println("\nChuỗi ban đầu: " + string);
        for (int i = 0; i < string.length(); i++) {
            stack1.push(string.charAt(i));
        }
        int x = string.length();
        string = new StringBuilder();
        for (int i = 0; i < x; i++) {
            string.append(stack1.pop());
        }
        System.out.println("Chuỗi sau khi đảo: " + string);
    }
}
