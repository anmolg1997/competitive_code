class Solution {
    public boolean isArmstrong(int n) {
        int cube=0;
        int temp_n=n;
        int digit_= countDigit(temp_n);

        while (temp_n>0) {
            cube+=Math.pow(temp_n%10, digit_);
            temp_n/=10;
        }

        if (cube==n) return true;
        return false;
    }

    public static int countDigit(int n) {
        int count_=0;

        while(n>0){
            n/=10;
            count_+=1;
        }

        return count_;
    }
}