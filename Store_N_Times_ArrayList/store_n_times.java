import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String> result = new ArrayList<>();

        addString(result, n);
        return result;
    }

    public static void addString(List<String> result_, int num){
        
        if (num==0) return;
        
        addString(result_, num-1);
        result_.add("Coding Ninjas");
        return;

    }

}
