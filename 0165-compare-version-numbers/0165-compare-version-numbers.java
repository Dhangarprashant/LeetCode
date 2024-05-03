class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split("\\.");
        String arr2[]=version2.split("\\.");
        int first=0;
        int second=0;
        int length=Math.max(arr1.length,arr2.length);
        for(int i=0;i<length;i++){
            int first_val = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int second_val = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if(first_val>second_val){
                return 1;
            }else if(first_val<second_val){
                return -1;
            }
        }
        return 0;
    }
}

