import java.util.Scanner;

public class FirstOccurance {
    public static int findFirstOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.print("Enter element to find: ");
        int key = sc.nextInt();
        int index = findFirstOccurrence(arr, key);
        System.out.println(index != -1 ? "First occurrence of " + key + " is at index " + index : "Element " + key + " not found.");
        sc.close();
    }
}
