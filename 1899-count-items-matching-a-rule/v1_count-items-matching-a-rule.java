class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       Map<String, Integer> ruleDict = new HashMap<>();
       ruleDict.put("type", 0);
       ruleDict.put("color", 1);
       ruleDict.put("name", 2);

    int ruleInd = ruleDict.get(ruleKey);
    int cnt = 0;

    for (List<String> item : items) {
        if (item.get(ruleInd).equals(ruleValue)) cnt+=1;
    }

    return cnt;
    }  
}
