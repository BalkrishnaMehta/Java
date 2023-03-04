// Balkrishna Mehta
// 202103103510434 (38)
// CS-1

public class Prac15 {
    public static void main(String[] args){
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}
class Thread1 extends Thread {
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Thread1");
                Thread.sleep(2000);
            }
        } catch(Exception ex) {}
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Thread2");
                Thread.sleep(4000);
            }
        } catch(Exception ex) {}
    }
}