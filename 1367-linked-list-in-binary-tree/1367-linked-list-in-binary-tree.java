/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null)
            return false;
        return isSubPathUtil(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean isSubPathUtil(ListNode listNode, TreeNode treeNode) {
        if (listNode == null)
            return true;
        if (treeNode == null)
            return false;
        if (listNode.val == treeNode.val)
            return isSubPathUtil(listNode.next, treeNode.left) || isSubPathUtil(listNode.next, treeNode.right);
        return false;
    }
}