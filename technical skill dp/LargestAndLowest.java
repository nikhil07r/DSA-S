// find the difference between the largest and lowest number among any three numbers.do not use min max.
public class LargestAndLowest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int largest = Math.max(Math.max(a, b), c);
        int lowest = Math.min(Math.min(a, b), c);
        System.out.println("Difference: " + (largest - lowest));
    }
}