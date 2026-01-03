// Shared resource class
class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400); // simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread classes
class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5); // prints multiples of 5
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100); // prints multiples of 100
    }
}

// Main class
public class Syncthread {
    public static void main(String[] args) {
        Table obj = new Table(); // shared object

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}