package Hello_multi;

public class Hello_multi {

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {

            new HelloThread().start();
        }
        System.out.println("Hello from main thread!");
    }

    private static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.printf("Hello from %s\n", getName());
        }

    }
}
