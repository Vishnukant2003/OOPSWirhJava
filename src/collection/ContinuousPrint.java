package collection; // Add this line matching your project folder structure

class MorningThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Morning thread interrupted: " + e.getMessage());
            }
        }
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Welcome thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ContinuousPrint {
    public static void main(String[] args) {
        MorningThread thread1 = new MorningThread();
        WelcomeThread thread2 = new WelcomeThread();

        thread1.start();
        thread2.start();
    }
}
