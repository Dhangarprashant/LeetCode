// class Solution {
//     public int findLucky(int[] arr) {
//         int count=0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]==arr[i+1]){
//                 count++;
//                 if(count==i){
//                     return i;
//                 }else{
//                     i++;
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> pra:map.entrySet()){
            if(pra.getKey()==pra.getValue()){
                max=Math.max(pra.getKey(),max);
            }
        }
        if(max!=Integer.MIN_VALUE){
            return max;
        }
        return -1;
    }
}