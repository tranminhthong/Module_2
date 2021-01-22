import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TestPalindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }
        boolean flag = false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (stack.pop() == queue.remove()) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The above string is the Palindrome string");
        } else
            System.out.println("The above string is not a Palindrome string");
    }
}
