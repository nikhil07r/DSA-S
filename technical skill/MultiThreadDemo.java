public class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sharedBuffer = new StringBuffer();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                sharedBuffer.append("Thread-1 step ").append(i).append("\n");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                sharedBuffer.append("Thread-2 step ").append(i).append("\n");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Buffer:\n" + sharedBuffer);
    }
}