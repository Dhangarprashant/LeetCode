class Solution {
    public int titleToNumber(String columnTitle) {
        int colNum = 0;

        for(char c: columnTitle.toCharArray()){
            int d = c - 'A' + 1;
            colNum = colNum*26 + d;
        }

        return colNum;

    }
} 