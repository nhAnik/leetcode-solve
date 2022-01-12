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
    private int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        pathSumRecur(root, targetSum);
        return count;
    }

    public void pathSumRecur(TreeNode root, int targetSum) {
        if (root == null)
            return;
        pathSumUtil(root, targetSum);
        pathSumRecur(root.left, targetSum);
        pathSumRecur(root.right, targetSum);
    }

    public void pathSumUtil(TreeNode root, int curSum) {
        if (root == null)
            return;
        if (curSum == root.val)
            count++;
        pathSumUtil(root.left, curSum - root.val);
        pathSumUtil(root.right, curSum - root.val);
        
    }

}