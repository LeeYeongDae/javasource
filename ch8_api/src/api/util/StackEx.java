package api.util;

import java.util.List;
import java.util.Stack;

public class StackEx {
     public static void main(String[] args) {
          List<String> list = new Stack();
          // add, remove
          Stack<String> stack = new Stack<>();
          // push, pop
          stack.push("A");
          stack.push("B");
          stack.push("C");
          stack.push("D");
          while (!stack.empty()) {
               System.out.println(stack.pop());
          }
     }
}
