
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root == null) {
            return false;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean even = false;
        boolean odd = false;

        if (root.val % 2 == 0) {
            return false;
        } else {
            odd = true;
        }

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (even && node.val % 2 != 0) {
                    return false;
                }
                if (odd && node.val % 2 == 0) {
                    return false;
                }

                list.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            result.add(list);

            for (int i = 0; i < list.size() - 1; i++) {
                if (even) {
                    if (list.get(i) <= list.get(i + 1)) {
                        return false;
                    }
                } else {
                    if (list.get(i) >= list.get(i + 1)) {
                        return false;
                    }
                }
            }

            even = !even;
            odd = !odd;
        }

        return true;
    }
}
