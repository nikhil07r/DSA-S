import java.util.Scanner;
public class FrameSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                mat[i][j] = sc.nextInt();
        
        int sum = 0;
        for(int j=0; j<c; j++) {
            sum += mat[0][j] + mat[r-1][j];
        }
        for(int i=1; i<r-1; i++) {
            sum += mat[i][0] + mat[i][c-1];
        }
        
        System.out.println("Frame sum: " + sum);
    }
}
