
import java.;

class Thread1 implements Runnable{
    @Override 
    public  void run(){
        int i =0;
        while (i<=5) {
            System.err.println("welcome: "+i);
            i++;
        }
    }
}
class Thread2 implements Runnable{
    @Override 
    public void run(){
        int i =0;
        while (i<10) {
            System.err.println(" "+i);
            i++;
        }

    }
}



public class Main3 extends Thread{
    public static void main(String[] args)throws Exception {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();


        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        
        th1.setPriority(5);
        // Thread.currentThread();
        th2.setPriority(5);
        
        th2.start();
        th1.start();

        Thread.currentThread();

    }
    
}

// Demonstrate gerPriority() and setPriority() , currentThread() methods in Java threads.