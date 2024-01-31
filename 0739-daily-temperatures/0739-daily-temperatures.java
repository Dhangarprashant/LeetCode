class Solution {
    public int[] dailyTemperatures(int[] nums) {
        
        // Similar to next greater element but little difference do it good (revise it)
        
        int n=nums.length;
        int result[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>=nums[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return result;
    }
}