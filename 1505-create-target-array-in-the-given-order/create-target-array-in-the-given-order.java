class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[index.length];

        for (int i=0; i<index.length; i++) {
            insertArr(arr, i, index[i], nums[i]);
        }
        return arr;
    }

    public static void insertArr(int[] arr_, int i_, int index_, int value_) {
        if (i_ == index_) {
            arr_[index_] = value_;
        }
        else {
            int j = arr_.length-1;
            while (j>index_) {
                arr_[j] = arr_[j-1];
                j--;
            }
            arr_[index_] = value_;
        }
    }
}