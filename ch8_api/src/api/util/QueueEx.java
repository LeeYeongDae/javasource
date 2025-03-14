package api.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
     public static void main(String[] args) {
          Queue<String> queue = new LinkedList<>();
          // push, pop
          queue.offer("A");
          queue.offer("B");
          queue.offer("C");
          queue.offer("D");
          while (!queue.isEmpty()) {
               System.out.println(queue.poll());
          }
     }
}
