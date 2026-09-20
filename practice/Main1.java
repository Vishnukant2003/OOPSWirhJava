import java.io.*;
import java.util.*;

class Thread1 implements Runnable{
    @Override 
    public void run(){
       while(true) {
        System.err.println("Good morning");
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e ){
            System.err.println(e);

        }
       }
    }
}


class Thread2 implements  Runnable{
    @Override 
    public void run(){
        while (true) {
            System.err.println("Welcome ");
            try{
            
                Thread.sleep(2000);
        
                } catch(InterruptedException e ){
            System.err.println(e);

        }
            }
    }
}
public class Main1{
    public static void main(String[] args) {
        Thread1 gm = new Thread1();
        Thread2 wlc = new Thread2();

        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(wlc);
   
        t1.start();
        t2.start();
        
    }
}
