import java.util.*;
public class SearchFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
    }
    static int searchFloor(int[] A, int target) {
        int s = 0, e = A.length - 1 , ans = Integer.MIN_VALUE;
        while (s <= e) {
            int m = (s + e) / 2;
            if (A[m] == target) {
                return A[m];
            }
            else if (A[m] > target) {
                e = m - 1;
            }
            else{
                s = m + 1;
                ans = A[m];
            }
        }
        return ans;
    }
}