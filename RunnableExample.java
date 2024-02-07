class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        System.out.println("Main Thread is Running");
    }
}
