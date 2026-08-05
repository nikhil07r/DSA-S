// we have to print number between a big number and small number like 50 to 15 using while do while or for use all give only one output.
public class Main {
    public static void main(String[] args) {
        int big = 50;
        int small = 15;
        int i = big;
        while (i >= small) {
            System.out.print(i + " ");
            i--;
        }
    }
}