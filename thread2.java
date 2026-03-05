class MyRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"hiiii");
    }
}

public class thread2 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
           Thread t1 = new Thread(obj);
           t1.start();
           try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
           System.out.println("hellooo");
    }
    
}
