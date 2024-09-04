class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Thread 1 is running");
            System.out.println("Hello from Thread 1");
            i++;
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Thread 2 is running");
            System.out.println("Hello from Thread 2");
            i++;
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating an instance of MyThread1
        MyThread1 t1 = new MyThread1();
        
        // Creating an instance of MyThread2
        Runnable r2 = new MyThread2();
        Thread t2 = new Thread(r2);
        
        // Starting the threads
        t1.start();
        t2.start();
    }
}

