// wap to count the number of digits in a given number.

public class Count {
    public static void main(String[] args) {
        int number = 1234567890; 
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++; 
        }

        System.out.println("Number of digits: " + count);
    }
}