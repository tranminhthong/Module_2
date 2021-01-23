import java.util.Stack;

public class Bracket_Stack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "(((((()))))))))))";
        boolean flag = true;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                num1++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char operator = str.charAt(i);
            if (operator == ')') {
                num2++;
                if (stack.isEmpty()) {
                    flag = false;
                } else {
                    char left = stack.pop();
                    String x = left + String.valueOf(operator);
                    if (!x.equals("()")) {
                        flag = false;
                    }
                }
            }
        }
        if (flag && num1 == num2) {
            System.out.println("đúng");
        } else System.out.println("sai");
    }
}
