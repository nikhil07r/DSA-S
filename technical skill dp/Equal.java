//  wap to find the largest of a & b . if a & b are equal then print "Both numbers are equal".

public class Equal {
    public static void main(String[] args) {
        int a = 20, b = 20;
        if (a > b) {
            System.out.println("Largest: " + a);
        } else if (b > a) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}

