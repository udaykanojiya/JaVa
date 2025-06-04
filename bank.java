class WithdrawlThread extends Thread {
    static int totalBalance = 1000;
    int amount;

    public  WithdrawlThread(int amount){
        this.amount=amount;
    }

    public synchronized void run(){
        if(totalBalance>=amount){
            System.out.println("paisa apke pass aa jayega" + amount);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            totalBalance-=amount;;
            System.out.println(totalBalance);
        }
        else{
            System.out.println("Gareeb!!!!");
        }
    }
}


public class bank {
    public static void main(String[] args) {
        WithdrawlThread t1 = new WithdrawlThread(800);
        WithdrawlThread t2 = new WithdrawlThread(500);
        t1.start();
        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        t2.start();

        
    }
    
}
