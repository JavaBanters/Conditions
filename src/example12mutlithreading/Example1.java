package example12mutlithreading;

import java.io.Serializable;

class MyCustomThread extends Thread  {

    int number ;

    public MyCustomThread(int i) {
        this.number = i;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread Number =>"+this.number+ "     " +i+"      "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

}

public class Example1 {

    public void print() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args){
//        Example1 ex = new Example1();
//        ex.print();
//        ex.print();
//        MyCustomThread thread = new MyCustomThread(1);
//        thread.start();
//
//        System.out.println("Hello");
//        MyCustomThread thread1 = new MyCustomThread(2);
//        thread1.start();


        for(int i = 0; i < 5; i++) {
            MyCustomThread thread = new MyCustomThread(i);
            thread.start();
        }

        System.out.println("Hello");

    }

}
