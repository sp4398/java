import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Rick");
        q.add("Maggie");
        q.add("Glenn");
        q.add("Negan");
        q.add("Daryl");
        System.out.println("Elements in Queue:" + q);

        System.out.println("Removed element: " + q.remove());

        System.out.println("Head: " + q.element());
        System.out.println("poll(): " + q.poll());
        System.out.println("peek(): " + q.peek());
        System.out.println("Elements in Queue:" + q);
    }
}
