import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> resultArr = new ArrayList<>(Collections.nCopies(candies.length, Boolean.TRUE));

        for ( int kid=0; kid < candies.length; kid++){

            int kid_candies = candies[kid]+extraCandies;

            for (int max_chk=0; max_chk<candies.length; max_chk++) {
                
                if (kid_candies < candies[max_chk]) {
                    resultArr.set(kid, false);
                }
            }
        }

        return resultArr;
    }
}
