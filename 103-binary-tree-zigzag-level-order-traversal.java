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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return result;
        boolean leftToRight = true;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> row = new ArrayList<>(size);
            for (int i=0; i<size; i++) {
                TreeNode curr = q.peek();
                if (curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
                if (leftToRight == true)
                    row.add(q.poll().val);
                else
                    row.add(0, q.poll().val);
            }
            leftToRight = !leftToRight;
            result.add(row);
        }
        return result;
    }
}