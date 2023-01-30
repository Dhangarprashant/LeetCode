// class Solution 
// {
//     public int findCenter(int[][] edges) 
//     {
//         int n=edges.length+1;
//         int[] edgeCount=new int[n+1];
//         for(int[] edge:edges){
//             int x=edge[0];
//             int y=edge[1];
//             edgeCount[x]++;
//             edgeCount[y]++;
//             if(edgeCount[x]>1){
//                 return x;
//             }
//             if(edgeCount[y]>1){
//                 return y;
//             }
//         }
//         return 0;
//     }
// }

// import java.util.HashSet;
// import java.util.Set;
// public class solution{
// 	public int findcenter(int[][] edges)
// 	{
// 		Set<Integer> outEdgesFound=new HashSet<>();
// 		for(int[] edge:edges)
//         {
// 			if(outEdgesFound.contains(edges[0])){
//                 return edge[0];
//             }
//                outEdgesFound.add(edge[0]);
//                if(outEdgesFound.cointains(edge[1])){
//                    return edge[1];
//                }
//                outEdgesFound.add(edge[1]);
// 		}
//                return -1;
// 	}
// }



class Solution{
    public int findCenter(int[][] edges){
        int a=edges[0][0];
         int b=edges[0][1];
         int c=edges[1][0];
         int d=edges[1][1];
        return a==c||a==d?a:b;
    }
}