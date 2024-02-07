public class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread: " + Thread.currentThread().getName() + " :" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("t1");
        ThreadDemo t2 = new ThreadDemo("t2");
        ThreadDemo t3 = new ThreadDemo("t3");
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        t2.start();
        t3.start();
    }
}
