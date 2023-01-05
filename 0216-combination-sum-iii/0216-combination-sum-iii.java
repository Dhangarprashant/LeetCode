class Solution 
{
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        LinkedList<Integer> comb=new LinkedList<Integer>();
        this.backtrack(n,k,list,comb,0);
        return list; 
    }
    protected void backtrack(int remain,int k,List<List<Integer>> ans,LinkedList<Integer> comb,int start){
        if(remain==0 && comb.size()==k){
            ans.add(new ArrayList<Integer>(comb));
            return;
        }else if(remain<0 || comb.size()==k){
            return;
        }
        for(int i=start;i<9;++i){
            comb.add(i+1);
            this.backtrack(remain -i -1,k,ans,comb,i+1);
            comb.removeLast();
        }
    }
}
