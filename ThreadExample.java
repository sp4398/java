class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("Main Thread is Running");
    }
}
