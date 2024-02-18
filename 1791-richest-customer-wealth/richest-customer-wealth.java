class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;

        for (int cust_id=0; cust_id < accounts.length; cust_id++) {
            int cust_wealth = 0;
            for (int acc_id=0; acc_id < accounts[cust_id].length; acc_id++){
                cust_wealth+=accounts[cust_id][acc_id];
            }

            max_wealth = (max_wealth < cust_wealth) ? cust_wealth : max_wealth;

        }

        return max_wealth;
    }
}