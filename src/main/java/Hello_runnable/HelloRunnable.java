package Hello_runnable;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf("Hello from %s\n", Thread.currentThread().getName());
    }
}
