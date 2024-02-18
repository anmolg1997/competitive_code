class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        ansArray(ans, nums, 0);
        return ans;
    }

    public static void ansArray(int[] arr, int[] source, int ind){
        if (ind==source.length) return;
        arr[ind] = source[source[ind]];
        ansArray(arr, source, ind+1);
    }
}