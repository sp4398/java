class MyThread extends Thread{
    public MyThread(String name,int prority){
        super(name);
        setPriority(prority);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(getName()+": Count: "+i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.err.println(e);
            }
        }
    }
}
public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("High Priority Thread",Thread.MAX_PRIORITY);
        MyThread thread2 = new MyThread("Medium Priority Thread",Thread.NORM_PRIORITY);
        MyThread thread3 = new MyThread("Low Priority Thread",Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        }
        
}
