// wap to count all the even numbers in between 2 numbers input by user.
public class Evencount {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
    }
}