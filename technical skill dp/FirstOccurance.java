// wap to find the first occurrence of an element in an array

import java.util.*;

class FirstOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 2, 4, 5, 2 };
        System.out.print("Enter element to find: ");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("First occurrence of " + key + " is at index " + i);
                return;
            }
        }

        System.out.println("Element not found.");
    }
}
