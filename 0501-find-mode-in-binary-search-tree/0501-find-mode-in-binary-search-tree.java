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
class Solution {
    int max=0;
    int count=1;
    TreeNode prev=null;
    public int[] findMode(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        inorder(root,list);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i).val;
        }
        return res;
    }
    public void inorder(TreeNode node,List<TreeNode> list){
        if(node==null){
            return;
        }
        inorder(node.left,list);
        if(prev!=null){
            if(node.val==prev.val){
                count++;
            }else{
                count=1;
            }
        }
        if(count>max){
            list.clear();
            list.add(node);
            max=count;
        }else if(count==max){
            list.add(node);
        }
        prev=node;
        inorder(node.right,list);
    }
}