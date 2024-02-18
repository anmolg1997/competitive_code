import java.util.Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] outArray = new int[2*n];

        for (int i=0; i<n; i++) {
            outArray[2*i]=nums[i];
            outArray[2*i+1]=nums[n+i];  
        }

        return outArray;
    }



}