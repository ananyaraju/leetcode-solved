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
    public List<Integer> getLeaves(List<Integer> leaves, TreeNode root) {
        if (root == null)
            return null;
        if (root.right == null && root.left == null)
            leaves.add(root.val);
        if (root.left != null)
            getLeaves(leaves, root.left);
        if (root.right != null)
            getLeaves(leaves, root.right);
        return leaves;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        getLeaves(leaves1, root1);
        getLeaves(leaves2, root2);
        return leaves1.equals(leaves2);
    }
}