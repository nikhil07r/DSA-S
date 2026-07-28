public class MinTimeToEqual {
    public static long minTimeToEqual(int[] a) {
        if (a == null || a.length == 0) return 0;

        int max = a[0];
        for (int v : a) max = Math.max(max, v);

        long time = 0;
        for (int v : a) time += (long) (max - v);
        return time;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(minTimeToEqual(a)); 

        int[] b = {5, 5, 5};
        System.out.println(minTimeToEqual(b));

        int[] c = {1, 100, 50};
        System.out.println(minTimeToEqual(c)); 
    }
}







// find the maximum element in tha array 
// fo revery element calculate hoe much tim eits needs to be increase to reach the maximum element
// sum all those elements .









// given an array of intiger a find and written the product array of the same size where the ith element of the product array will be equals to the product of the all elements divided by the ith element of array.