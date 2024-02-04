class Solution {
    public boolean isPalindrome(int x) {
        
            String x_str = Integer.toString(x);
            int len_x = x_str.length();

            for (int i=0; i<len_x/2; i++){
                if (x_str.charAt(i)!=x_str.charAt(len_x-i-1)) return false;
            }

            return true;
        
    }
}