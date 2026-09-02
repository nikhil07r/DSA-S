// wap to insert an element in an array in starting

import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.print("Enter element to insert: ");
        int elementToInsert = sc.nextInt();

        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = elementToInsert;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
