class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[101];

        for (int i=0; i<nums.length; i++) {
            arr[nums[i]]+=1;
        }

        for (int i=1; i<arr.length; i++) {
            arr[i]+=arr[i-1];
        }

        int[] result = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            result[i] = (nums[i]>0) ? arr[nums[i]-1]:0;
        }

        return result;
    }
}