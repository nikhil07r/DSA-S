public class SingleThreadDemo {
    public static void main(String[] args) {
        StringBuilder logBuilder = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            logBuilder.append("Task ").append(i).append(" completed.\n");
        }

        System.out.println("Final Log:\n" + logBuilder.toString());
    }
}