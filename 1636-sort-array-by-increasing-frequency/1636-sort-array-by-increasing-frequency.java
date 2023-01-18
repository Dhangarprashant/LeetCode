class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int k=0;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        List<List<Integer>> list= new ArrayList<>();
        for(int i=1;i<=100;i++){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(Integer key: map.keySet()){
                    if(map.get(key)==i){
                        arr.add(key);
                    }
            }
            Collections.sort(arr, Collections.reverseOrder());
            for(int j=0;j<arr.size();j++){
                int p=i;
                while(p--!=0)
                ans[k++]=arr.get(j);
            }
        }
        return ans;
        
    }
}