package Day9;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "T1");
        Thread t2 = new Thread(new MyThread(), "T2");
        Thread t3 = new Thread(new MyThread(), "T3");

        t1.start();
        try {
            t1.join(); // Thread will stop execution until t1 is terminated
        } catch (Exception e) {
            e.getMessage();
        }

        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            e.getMessage();
        }

        t3.start();
        try {
            t3.join();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("All thread ended");
    }
}

class MyThread implements Runnable {
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread Running : " + thread.getName());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Thread ended :" + thread.getName());
    }
}
