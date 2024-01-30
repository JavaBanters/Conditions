package example8collections;

class MyThread extends Thread {

    public void run() {
        int [] arr = {1,2,3,4,5};

        for(int i = 0 ; i < arr.length; i++) {
            System.out.println("Current Thread::"+Thread.currentThread().getName()+ "  " +arr[i]);
        }
    }

}

public class ThreadExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

        MyThread t3 = new MyThread();
        t3.start();

    }

}
