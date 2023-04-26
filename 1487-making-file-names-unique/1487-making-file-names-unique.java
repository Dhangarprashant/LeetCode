class Solution {
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            String str=names[i];
            while(map.containsKey(str)){
                int count=map.get(names[i]);
                count=count+1;
                map.put(names[i],count);
                StringBuilder sb=new StringBuilder();
                sb.append(names[i]);
                sb.append("(");
                sb.append(count);
                sb.append(")");
                str=sb.toString();
            }
            map.put(str,0);
            names[i]=str;
        }
        return names;
    }
}
