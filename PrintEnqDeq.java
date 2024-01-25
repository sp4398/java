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
public class PrintEnqDeq {

    private Queue<PrintJob> printQueue;

    public PrintEnqDeq() {
        this.printQueue = new LinkedList<>();
    }

    public void enqueue(PrintJob job) {
        printQueue.offer(job);
        System.out.println("Enqueued: " + job);
    }

    public void dequeue() {
        if (!printQueue.isEmpty()) {
            PrintJob currentJob = printQueue.poll();
            System.out.println("Printing: " + currentJob);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No print jobs in the queue.");
        }
    }
    public static void main(String[] args) {
        PrintEnqDeq printingQueue = new PrintEnqDeq();

        printingQueue.enqueue(new PrintJob("Document1"));
        printingQueue.enqueue(new PrintJob("Document2"));
        printingQueue.enqueue(new PrintJob("Document3"));

        printingQueue.dequeue();
        printingQueue.dequeue();
        printingQueue.dequeue();
        printingQueue.dequeue(); 

        System.out.println("All print jobs processed.");
    }
}
