import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test{
    public static void main(String[] args) {
        Stack <String>  stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.remove());
    }
}
