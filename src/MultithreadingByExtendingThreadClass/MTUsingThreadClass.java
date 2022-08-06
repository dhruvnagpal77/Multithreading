package MultithreadingByExtendingThreadClass;

public class MTUsingThreadClass {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Task1 kicked off");
        Task1 task1 =  new Task1();
        task1.start();

        System.out.println("Task2 kicked off");
        Task2 task2 =  new Task2();
        task2.start();

        System.out.println("Task3 kicked off");
        Task3 task3 =  new Task3();
        task3.start();

        System.out.println("Main done");

    }
}

class Task1 extends Thread {
    public void run() {
        System.out.println("\nTask1 started\n");
        for (int i = 100; i <= 199; i ++) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask1 done\n");
    }
}

class Task2 extends Thread {
    public void run() {
        System.out.println("\nTask2 started\n");
        for (int i = 200; i <= 299; i ++) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask2 done\n");
    }
}

class Task3 extends Thread {
    public void run() {
        System.out.println("\nTask3 started\n");
        for (int i = 300; i <= 399; i ++) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask3 done\n");
    }
}