import java.util.*;
public class SearchTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int index = search(A, 23);
        System.out.println(index);
    }
    static int search(int[] A, int target) {
        int s = 0, e = A.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (A[mid] == target) {
                return mid;
            }
            else if (A[mid] < target) {
                s = mid + 1;
            }
            else {
                e = mid -1;
            }
        }
        return -1;
    }
}
