import java.util.Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        for (int i=n; i<2*n; i++) {
            shuffleElement(nums, i, n);
        }

        return nums;
    }


    public static void shuffleElement(int[] arr, int ind, int num) {

        int tmp = arr[ind];

        for (int j=ind; j>=2*(ind-num+1); j--) {
            arr[j] = arr[j-1];
        }

        arr[2*(ind-num)+1] = tmp;
    }
}