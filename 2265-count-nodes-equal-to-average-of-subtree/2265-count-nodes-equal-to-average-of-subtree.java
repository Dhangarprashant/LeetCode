/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     class Pair{
//         int sum;
//         int ele;
//         public Pair(int sum,int ele){
//             this.sum=sum;
//             this.ele=ele;
//         }
//     }
//     public  Pair helper(TreeNode node,int count){
//         if(node==null){
//             return new Pair(0,0);
//         }
//         Pair lh=helper(node.left,count);
//         Pair rh=helper(node.right,count);
        
//         int sum=lh.sum+rh.sum+node.val;
//         int ele=lh.ele+rh.ele+1;
        
//         if(sum/ele==node.val){
//             count++;
//         }
//         return Pair(sum,ele);
//     }
//     public int averageOfSubtree(TreeNode root) {
//         int count=0;
//         return helper(root,count);
//         return count;
//     }
// }

class Solution {
    class Pair {
        int sum;
        int ele;

        public Pair(int sum, int ele) {
            this.sum = sum;
            this.ele = ele;
        }
    }

    class Result {
        Pair pair;
        int count;

        public Result(Pair pair, int count) {
            this.pair = pair;
            this.count = count;
        }
    }

    public Result helper(TreeNode node, int count) {
        if (node == null) {
            return new Result(new Pair(0, 0), count);
        }
        Result lh = helper(node.left, count);
        Result rh = helper(node.right, lh.count); // 

        int sum = lh.pair.sum + rh.pair.sum + node.val;
        int ele = lh.pair.ele + rh.pair.ele + 1;

        if (sum / ele == node.val) {
            rh.count++;
        }

        return new Result(new Pair(sum, ele), rh.count);
    }

    public int averageOfSubtree(TreeNode root) {
        Result result = helper(root, 0);
        return result.count;
    }
}
