
class Solution {
    public int rob(TreeNode root) {
        int[] options=travel(root);
        return Math.max(options[0],options[1]);
    }
    public static int[] travel(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int leftNodeChoice[]=travel(root.left);
        int rightNodeChoice[]=travel(root.right);
        int options[]=new int[2];
        options[0]=root.val+leftNodeChoice[1]+rightNodeChoice[1];
        options[1]=Math.max(leftNodeChoice[0],leftNodeChoice[1])+Math.max(rightNodeChoice[0],rightNodeChoice[1]);
        return options;
    }
}