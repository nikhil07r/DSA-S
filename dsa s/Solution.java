import java.util.*;

public class Solution {
    public int[] solve(int A) {
        int[] res = new int[A];
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3));
        
        for (int i = 0; i < A; i++) {
            res[i] = q.poll();
           if (q.size() < A) {
                q.add(res[i] * 10 + 1);
                q.add(res[i] * 10 + 2);
                q.add(res[i] * 10 + 3);
            }
        }
        return res;
    }
}