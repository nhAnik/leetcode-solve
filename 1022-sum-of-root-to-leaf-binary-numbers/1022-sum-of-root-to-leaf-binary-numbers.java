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
    private int sum = 0;
    private int curNum = 0;
    public int sumRootToLeaf(TreeNode root) {
        visit(root);
        return sum;
    }
    
    private void visit(TreeNode root) {
        curNum = 2 * curNum + root.val;
        if (root.left == null && root.right == null) {
            sum += curNum;
        }
        if (root.left != null) {
            visit(root.left);
        }
        if (root.right != null) {
            visit(root.right);
        }
        curNum -= root.val;
        curNum /= 2;
    }
}