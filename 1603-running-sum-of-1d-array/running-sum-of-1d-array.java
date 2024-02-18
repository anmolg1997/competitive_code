class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] runNums = new int[nums.length];
        runNums[0] = nums[0];

        for (int i=1; i<nums.length; i++) {
            runNums[i] = runNums[i-1] + nums[i];
        }

        return runNums;
    }

}