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
    List<String> ans = new ArrayList<>();
    public void traversal(TreeNode root, String s) {
        if (root == null)
            return;
        s += root.val + "->";
        traversal(root.left, s);
        traversal(root.right, s);
        if (root.right == null && root.left == null) {
            ans.add(s.substring(0, s.length()-2));
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root, "");
        return ans;
    }
}