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
        return lcaUtil(node, p, q);
    }
    
    private TreeNode lcaUtil(TreeNode node, TreeNode p, TreeNode q) {
        if (node.val >= p.val && node.val <= q.val) return node;
        if (node.val > q.val) return lcaUtil(node.left, p, q);
        return lcaUtil(node.right, p, q);
    }
}