class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current=0;
        int totalFuel=0;
        int totalCost=0;
        int diff=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            totalCost=totalCost+cost[i];
            totalFuel=totalFuel+gas[i];
        }
        if(totalFuel<totalCost){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            current=current+gas[i]-cost[i];
            if(current<0){
                start=i+1;
                current=0;
            }
        }
        return start;
    }
}