package MTUsingExecutorService;

import java.util.concurrent.*;

public class MTUsingExecutorServiceRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Task1 which is returning a value
        Future<String> result = executorService.submit(new CallableTask(1));
        System.out.println("new CallableTask(1) completed");

        // Waits if necessary for the computation to complete, and then retrieves its result
        System.out.println(result.get());

        // Task2 which is not returning a value
        executorService.execute(new RunnableTask(2));
        System.out.println("new RunnableTask(2) completed");

        System.out.println("Main completed");

        executorService.shutdown();
    }
}

// Have to implement Callable interface if we want thread to return a value
class CallableTask implements Callable<String> {

    private Integer taskNo;

    public CallableTask(Integer taskNo) {
        this.taskNo = taskNo;
    }

    @Override
    public String call() throws InterruptedException {
        Thread.sleep(2000);
        return "I have returned Task# " + taskNo;
    }
}

// Have to implement Runnable interface if we don't want a thread to return a value
class RunnableTask implements Runnable {

    private Integer taskNo;

    public RunnableTask(Integer taskNo) {
        this.taskNo = taskNo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I have displayed task#" + taskNo);
    }
}