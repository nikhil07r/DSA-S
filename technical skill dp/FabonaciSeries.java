public class FabonaciSeries {
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1, sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum += a;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\nSum = " + sum);
    }
}
