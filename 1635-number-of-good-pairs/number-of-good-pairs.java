class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;

        Map<Integer, Integer> item_map = new HashMap<>();

        for ( int i=0; i < nums.length; i++){
            if (item_map.containsKey(nums[i])) {
                item_map.put(nums[i], item_map.get(nums[i])+1);
            } else {
                item_map.put(nums[i], 0);
            }
        }

        for ( Map.Entry<Integer, Integer> item : item_map.entrySet()) {
            int value = item.getValue();
            goodPair+= (value * (value+1))/2;
        }

        return goodPair;
    }
}