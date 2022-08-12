/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        if (node.val >= p.val && node.val <= q.val) return node;
        if (node.val > q.val) return lowestCommonAncestor(node.left, p, q);
        return lowestCommonAncestor(node.right, p, q);
    }
}