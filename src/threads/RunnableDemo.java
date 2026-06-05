package threads;


class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running1...");
    }
}
class MyRunnable2 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running2...");
    }
}
class MyRunnable3 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running3  ...");
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);

        t.start();
    }
}
