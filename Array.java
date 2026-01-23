public class Array {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 5};
        int n = arr.length;
 
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < max) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}