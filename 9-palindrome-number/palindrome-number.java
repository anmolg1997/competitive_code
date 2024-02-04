class Solution {
    public boolean isPalindrome(int x) {
        
            if (x<0) return false;
            if (x>=0 && x<=9) return true;

            int rev_x = 0;
            int sign_x = (x<0) ? -1 : 1;
            int abs_x = sign_x*x;

            while (abs_x >0) {
                rev_x = rev_x*10 + abs_x%10;
                abs_x/=10;
            }

            if (x==rev_x*sign_x) return true;
            return false;

    }
}