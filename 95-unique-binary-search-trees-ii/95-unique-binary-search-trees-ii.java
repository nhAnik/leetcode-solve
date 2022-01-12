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
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
    
    public List<TreeNode> generateTrees(int l, int h) {
        List<TreeNode> allNodes = new ArrayList<>();
        if (l == h)
            allNodes.add(new TreeNode(l));
        else if (l > h)
            allNodes.add(null);
        else {
            for (int i = l; i <= h; i++) {
                List<TreeNode> rightNodes = generateTrees(i + 1, h);
                List<TreeNode> leftNodes = generateTrees(l, i - 1);
                for (TreeNode left : leftNodes) {
                    for (TreeNode right : rightNodes) {
                        allNodes.add(new TreeNode(i, left, right));
                    }
                }
            }
        }
        return allNodes;
    }
}