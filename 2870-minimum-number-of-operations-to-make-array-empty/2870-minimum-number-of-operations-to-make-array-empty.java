
import java.util.HashMap;

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : map.keySet()) {
            int occurrences = map.get(num);
            if(occurrences==1){
                return -1;
            }else{
                if(occurrences%3==0){
                    count=count+occurrences/3;
                }else if(occurrences%3==1 ||occurrences%3==2){
                    count=count+occurrences/3+1;
                }else if(occurrences%2==0){
                    count=count+occurrences/2;
                }else{
                    return -1;
                }
            }
        }
        return count;
    }
}
