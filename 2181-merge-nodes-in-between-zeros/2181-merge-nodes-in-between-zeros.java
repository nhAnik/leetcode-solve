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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode p = head.next;
        ListNode tmp = head;
        int sm = 0;
        while (p != null) {
            if (p.val == 0) {
                tmp.val = sm;
                if (p.next == null) tmp.next = null;
                else tmp = tmp.next;
                sm = 0;
            } else sm += p.val;
            p = p.next;
        }
        return head;
    }
}