class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];
        System.arraycopy(nums, 0, nums2, 0, nums.length);
        System.arraycopy(nums, 0, nums2, nums.length, nums.length);

        return nums2;
    }
}