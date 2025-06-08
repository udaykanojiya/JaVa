class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);  // pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread task = new MyThread();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();  // Start thread A
        t2.start();  // Start thread B
    }
}

