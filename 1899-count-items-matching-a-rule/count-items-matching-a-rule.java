class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

       switch(ruleKey){
           case "type": return searchKey(items, ruleValue, 0, 0);
           case "color": return searchKey(items, ruleValue, 0, 1);
           default : return searchKey(items, ruleValue, 0, 2);
       }

    }

    public static int searchKey(List<List<String>> items_, String value, int itm_no, int index){
        if (items_.size()==itm_no) return 0;

        if (items_.get(itm_no).get(index).equals(value)){
            return 1+searchKey(items_, value, itm_no+1, index);
        }
        else {
            return searchKey(items_, value, itm_no+1, index);
        }
    }
}