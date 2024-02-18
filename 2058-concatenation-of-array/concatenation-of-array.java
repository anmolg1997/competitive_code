class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];
        
        for (int i=0; i<nums2.length; i++){
            nums2[i] = (i<nums.length) ? nums[i] : nums[i-nums.length];
        }
        return nums2;
    }
}


class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];
        
        for (int i=0; i<nums2.length; i++){
            nums2[i] = (i<nums.length) ? nums[i] : nums[i-nums.length];
        }
        return nums2;
    }
}