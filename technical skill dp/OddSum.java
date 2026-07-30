// wap to print the sum of odd numbers in between 2 numbers input by user.
public class OddSum {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}