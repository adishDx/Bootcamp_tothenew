// Q10 Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.
public class Q10 {
    int count;
    synchronized public void incrementCount() {
        count++;
    }
    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Q10 thread_run  = new Q10();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread_run.count);
    }
}

