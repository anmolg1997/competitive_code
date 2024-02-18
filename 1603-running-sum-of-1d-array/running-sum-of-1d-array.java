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

class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] runNums = new int[nums.length];

        runningSum(nums, runNums, 0);

        return runNums;
    }

    public static void runningSum(int[] source, int[] runSource, int ind) {

        if (ind == source.length) return;

        int tmp = 0;
        for ( int i=0; i<=ind; i++) {
            tmp+=source[i];
        }

        runSource[ind] = tmp;

        runningSum(source, runSource, ind+1);
    }
}
