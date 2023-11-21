class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val){
                list.add(nums[i]);
            }
            val=nums[i];
        }
        return list;
    }
}