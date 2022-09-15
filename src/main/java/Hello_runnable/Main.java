package Hello_runnable;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            new Thread(new HelloRunnable()).start();
        }
        System.out.println("Hello from Runnable!");
    }
}
