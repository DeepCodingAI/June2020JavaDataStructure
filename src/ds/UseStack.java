package ds;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("NY");
        stack.push("NJ");
        stack.push("PA");
        stack.push("FL");
        stack.push("CA");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
