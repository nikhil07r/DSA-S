// sum of all the even number in between two given numbers.
public class Sumofeven {
    public static void main(String[] args) {
        int big = 50;
        int small = 15;
        int sum = 0;
        for (int i = small; i <= big; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers between " + small + " and " + big + " is: " + sum);
    }
}