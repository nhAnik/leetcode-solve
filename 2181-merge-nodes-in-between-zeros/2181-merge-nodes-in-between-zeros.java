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
        ListNode ans = new ListNode(-1);
        ListNode tmp = ans;
        int sm = 0;
        while (head != null) {
            if (head.val == 0) {
                if (sm != 0) {
                    ans.next = new ListNode(sm);
                    ans = ans.next;
                }
                sm = 0;
            } else sm += head.val;
            head = head.next;
        }
        return tmp.next;
    }
}