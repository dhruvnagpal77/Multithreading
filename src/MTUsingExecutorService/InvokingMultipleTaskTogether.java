package MTUsingExecutorService;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokingMultipleTaskTogether {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<CallableTask> tasks = List.of(new CallableTask(1), new CallableTask(2), new CallableTask(3));

        // Waits for all the task to finish execution
        List<Future<String>> futures = executorService.invokeAll(tasks);
        System.out.println("new CallableTask(1), new CallableTask(2), new CallableTask(3) completed");

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        // Waits for any one task to finish execution & return that result
        String anyResult = executorService.invokeAny(tasks);
        System.out.println("Any result is: " + anyResult);

        System.out.println("Main completed");
        executorService.shutdown();
    }
}