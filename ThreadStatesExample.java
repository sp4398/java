class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
        synchronized(ThreadStatesExample.class){
            try{
                Thread.sleep(2000);
                ThreadStatesExample.class.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread is awake");
    }
}
public class ThreadStatesExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread1();
        System.out.println("Thread State: "+thread.getState());
        thread.start();
        System.out.println("Thread State: "+thread.getState());
        Thread.sleep(1000);
        System.out.println("Thread State: "+thread.getState());
        synchronized(ThreadStatesExample.class){
            ThreadStatesExample.class.notify();
        }
        Thread.sleep(1000);
        System.out.println("Thread State: "+thread.getState());
    }
}
