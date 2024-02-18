import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> resultArr = new ArrayList<>();

        int max_candies = 0;
        for (int i=0; i<candies.length; i++) {
            max_candies = (max_candies<candies[i]) ? candies[i]:max_candies;

        }
        for ( int kid=0; kid < candies.length; kid++){

            int kid_candies = candies[kid]+extraCandies;
            boolean chk = true;
            if (kid_candies < max_candies) {
                chk = false;
            }
            resultArr.add(kid, chk);
        }
        
        return resultArr;
    }
}