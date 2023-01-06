class Solution 
{
    public List<Integer> targetIndices(int[] nums, int target) 
    {
        List<Integer> result=new ArrayList<>();
        int length=nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i < length ; i++){
            if(nums[i]==target){
                result.add(i);
             
            }
        }
        return result;
    }
}
