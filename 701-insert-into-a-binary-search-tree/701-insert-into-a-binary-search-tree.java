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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode prev = null, cur = root;
        while (cur != null) {
            prev = cur;
            if (val > cur.val)
                cur = cur.right;
            else
                cur = cur.left;
        }
        TreeNode newNode = new TreeNode(val);
        if (prev == null)
            root = newNode;
        else if (val < prev.val)
            prev.left = newNode;
        else
            prev.right = newNode;
        return root;
    }
}