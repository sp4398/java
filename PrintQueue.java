import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    private String document;

    public PrintJob(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "PrintJob{" +
                "document='" + document + '\'' +
                '}';
    }
}

public class PrintQueue {

    public static void main(String[] args) {
        Queue<PrintJob> printQueue = new LinkedList<>();

        printQueue.offer(new PrintJob("Document1"));
        printQueue.offer(new PrintJob("Document2"));
        printQueue.offer(new PrintJob("Document3"));

        while (!printQueue.isEmpty()) {
            PrintJob currentJob = printQueue.poll();
            System.out.println("Printing: " + currentJob);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All print jobs processed.");
    }
}
