import java.util.*;
public class CountFrequencyInSortedArray {
    static int FirstOccurence(int[] A, int B) {
        int s = 0, e = A.length-1 , ans = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (A[mid] == B) {
                ans = mid;
                e = mid - 1;
            }
            else if (A[mid] < B) {
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
    static int LastOccurence(int[] A, int B) {
        int s = 0, e = A.length-1 , ans = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (A[mid] == B) {
                ans = mid;
                s = mid + 1;
            }
            else if (A[mid] < B) {
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int First = FirstOccurence(A, k);
        int Last = LastOccurence(A, k);
        if(First == -1){
            System.out.println(0);
        }
        else{
            System.out.println(Last - First + 1);
        }
    }
}