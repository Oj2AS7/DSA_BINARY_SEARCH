import java.util.*;
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0, end = nums.length - 1, ans = nums.length;
        while (start <= end) {
            int mid = (start+end) / 2;
            if (nums[mid]>=target){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(A);
        searchInsert(A,target);
    }
}
