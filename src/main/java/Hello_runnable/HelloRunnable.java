package Hello_runnable;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf("Hello from Runnable %s\n", Thread.currentThread().getName());
    }
}
