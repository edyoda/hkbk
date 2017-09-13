package multithreading;

public class Deadlock {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run()
			{
				synchronized (String.class) {
		            System.out.println("Thread 1: Holding lock on String Class...");
		            try { Thread.sleep(10); }
		            catch (InterruptedException e) {}
		            System.out.println("Thread 1: Waiting to acquire lock on Integer Class...");
		            synchronized (Integer.class) {
		               System.out.println("Thread 2: Holding lock on Integer and String Class...");
		            }
			}
		}
		};
			Thread t2 = new Thread(){
				public void run()
				{
					synchronized (Integer.class) {
			            System.out.println("Thread 2: Holding lock Integer Class...");
			            try { Thread.sleep(10); }
			            catch (InterruptedException e) {}
			            System.out.println("Thread 2: Waiting to acquire lock String Class...");
			            synchronized (String.class) {
			               System.out.println("Thread 2: Holding lock on Integer and String Class...");
			            }
				}
			}	

			};
			
			t1.start();
			t2.start();

}}
