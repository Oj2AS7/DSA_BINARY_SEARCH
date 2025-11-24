import java.util.*;
public class SortedRotatedArray {
    public static int TargetIndexInSortedRotatedArray(int A[], int target){
        int s =0;
        int e = A.length-1;
        while(s <= e){
            int m = (s+e)/2;
            if(A[m] == target){
                return m;
            }
            // Identify the sorted Half
            // Either the left portion is sorted or the right portion is sorted
            // if left part is sorted
            if(A[s]<=A[m]){
                if(A[s]<=target && target<=A[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
            // if right part is sorted
            else{
                if(A[m]<=target && target<=A[e]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int A[] = {7,8,9,1,2,3,4,5,6};
        int index = TargetIndexInSortedRotatedArray(A,4);
        System.out.println(index);
    }
}
