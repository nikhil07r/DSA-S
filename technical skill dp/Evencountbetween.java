// count all the even number in between two given numbers.
public class Evencountbetween {
    public static void main(String[] args) {
        int big = 50;
        int small = 15;
        int count = 0;
        for (int i = small; i <= big; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers between " + small + " and " + big + " is: " + count);
    }
}