### Ways to implement multithreading
1. Extending Thread class(Cannot return value form thread).
2. Implementing Runnable Interface(Cannot return value form thread).
3. Via ExecutorService Interface(Can return if we pass instance of Callable Interface in the .submit method)

### States of a Thread
1. NEW: Thread created but start() hasn't been called yet.
2. RUNNABLE: Ready to run but other thread is being executing.
3. RUNNING: Thread is running.
4. BLOCKED/WAITING: Waiting on some external service or thread which hasn't finished.
5. TERMINATED/DEAD: When thread has completed execution.

### Important methods
1. .setPriority(int value): Sets priority for the thread who called it which may or may not be adhered. value range from 1 to 10, 5 is default for every thread. 
2. .join(): Waits for the thread who called it to finish execution before going to next line of code.
3. Thread.sleep(int durationInMilliSecond): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
4. Thread.yield(): A hint to the scheduler that the current thread is willing to yield its current use of a processor. The scheduler is free to ignore this hint.

### Keywords
1. Synchronized: If any block/method of a class is synchronized it means only one thread can access them at a time, other threads have to wait.