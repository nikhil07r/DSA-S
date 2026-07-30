// wap to find the largest of a & b & c. if a & b & c are equal then print "Both numbers are equal".

public class Three {
    public static void main(String[] args) {
        int a = 20, b = 20, c = 20;
        if (a > b && a > c) {
            System.out.println("Largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest: " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest: " + c);
        } else {
            System.out.println("All numbers are equal");
        }
    }

}
