import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> resultArr = new ArrayList<>();

        for ( int kid=0; kid < candies.length; kid++){

            int kid_candies = candies[kid]+extraCandies;
            boolean chk = true;

            for (int max_chk=0; max_chk<candies.length; max_chk++) {
                
                if (kid_candies < candies[max_chk]) {
                    chk = false;
                }
            }
            resultArr.add(kid, chk);
        }

        return resultArr;
    }
}
