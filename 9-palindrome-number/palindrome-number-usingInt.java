class Solution {
    public boolean isPalindrome(int x) {

            // 1. Base Cases
            if (x<0) return false;
            if (x>=0 && x<=9) return true;

            // 2. Main Cases
            int rev_x = 0;
            int abs_x = x;

            while (abs_x >0) {
                rev_x = rev_x*10 + abs_x%10;
                abs_x/=10;
            }

            if (x==rev_x) return true;
            return false;

    }
}
