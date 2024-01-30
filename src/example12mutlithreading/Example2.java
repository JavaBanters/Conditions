package example12mutlithreading;

import java.io.Serializable;

class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1 ; i <=5 ; i++) {
            System.out.println(i+"    " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
//                if (Thread.currentThread().getName().equals("Thread-0")) {
//                    throw new RuntimeException();
//                }
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Example2 {

    public static void main(String[] args) throws InterruptedException {


        for(int i = 0 ; i < 5; i++) {
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            //thread.join();
        }
    }

}
