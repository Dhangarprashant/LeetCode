class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> row=null;
        List<Integer> prev=null;
        for(int i=0;i<rowIndex+1;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=row;
            list.add(row);
        }
        return list.get(rowIndex);
    }
}
