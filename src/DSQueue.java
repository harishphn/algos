import java.util.ArrayDeque;

public class DSQueue {
    public static void main(String[] args) {
        //Queue
        ArrayDeque<String> queue = new ArrayDeque<String>();
        queue.add("QA");
        queue.add("QB");
        queue.add("QC");
        queue.add("QD");
        System.out.println("Removed: " + queue.pop());
        queue.add("QE");
        queue.add("QF");
        queue.add("QG");
        while (queue.peek() != null) {
            System.out.print(queue.pop() + " ");
        }
        System.out.println();
    }
}