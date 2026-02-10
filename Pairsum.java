public class Pairsum {

    boolean Checksum(int arr[], int k) {
        int N = arr.length; 
        
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
            
                if (i != j && arr[i] + arr[j] == k) {
                    return true; 
                }
            }
        }
        return false;
    }
}