package multithreading;

public class MyThread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<11;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=11;i+=2) {
           System.out.println(i);
        }
    }
}

/*public class MyThread {
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 1; itr < 51; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.print(" " + itr);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 2; itr < 51; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.print(" " + itr);
                        try {
                            lock.notify();
                            if(itr==50)
                                break;
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {

        }
    }
}*/