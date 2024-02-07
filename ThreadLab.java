public class ThreadLab {
    private static int[] arr = {1, 20, 50, 15, 30};
    private static double result = 0;
    private static Object lock = new Object(); 

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            calculateAverage();
        });

        Thread thread2 = new Thread(() -> {
            printSquares();
        });

        thread1.start();
        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void calculateAverage() {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                result += i;
            }
            result /= 10;
            System.out.println("Thread 1: Average of first 10 numbers is " + result);
        }
    }

    private static void printSquares() {
        synchronized (lock) {
            System.out.print("Thread 2: Squares of numbers in the array are ");
            for (int num : arr) {
                System.out.print(num * num + " ");
            }
            System.out.println();
        }
    }
}
