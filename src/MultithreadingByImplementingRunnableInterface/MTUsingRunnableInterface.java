package MultithreadingByImplementingRunnableInterface;

public class MTUsingRunnableInterface {
    public static void main(String[] args) {

        System.out.println("Task1 kicked off");
        Thread thread1 =  new Thread(new Task1());
        thread1.start();

        System.out.println("Task2 kicked off");
        Thread thread2 =  new Thread(new Task2());
        thread2.start();

        System.out.println("Task3 kicked off");
        Thread thread3 =  new Thread(new Task3());
        thread3.start();

        System.out.println("Main done");

    }
}

class Task1 implements Runnable {
    public void run() {
        System.out.println("\nTask1 started\n");
        for (int i = 100; i <= 199; i ++) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask1 done\n");
    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.println("\nTask2 started\n");
        for (int i = 200; i <= 299; i ++) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask2 done\n");
    }
}

class Task3 implements Runnable {
    public void run() {
        System.out.println("\nTask3 started\n");
        for (int i = 300; i <= 399; i ++) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask3 done\n");
    }
}