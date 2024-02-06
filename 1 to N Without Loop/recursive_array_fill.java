public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr_= new int[x];
        next_num(x, arr_);
        return arr_;
    }

    public static void next_num(int num, int[] arr_){
        if (num==1) {
            arr_[0]=1;
            return ;
        }

        arr_[num-1]=num;
        next_num(num-1, arr_);
    }
}
