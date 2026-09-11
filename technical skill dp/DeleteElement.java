// wap to delete an elemet of an array at the given index.

import java.util.Scanner;

class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Array after deletion:");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}