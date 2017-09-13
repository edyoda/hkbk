package multithreading;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Message msg = new Message("process it");
        Waiter waiter1 = new Waiter(msg);
       
        Thread th1 = new Thread(waiter1,"waiter1");
        		th1.start();
        
        Waiter waiter2 = new Waiter(msg);
        Thread th2 = new Thread(waiter2, "waiter2");
        		th2.start();
        
        Notifier notifier = new Notifier(msg);
        Thread th3 = new Thread(notifier, "notifier");
        		th3.start();
        System.out.println("All the threads are started");
           	}
}
