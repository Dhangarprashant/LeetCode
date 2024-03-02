import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] arr1 = pattern.toCharArray();
        String[] arr2 = s.split(" ");
        
        if (arr1.length != arr2.length) {
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(arr1[i])) {
                if (!map.get(arr1[i]).equals(arr2[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(arr2[i])) {
                    return false;
                }
                map.put(arr1[i], arr2[i]);
            }
        }
        
        return true;
    }
}
