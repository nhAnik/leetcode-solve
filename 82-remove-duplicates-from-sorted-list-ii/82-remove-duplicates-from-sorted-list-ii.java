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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1000, head);
        ListNode cur = dummy, tmp;
        while (cur != null) {
            if (cur.next != null && cur.next.next != null && cur.next.val == cur.next.next.val) {
                tmp =cur.next;
                while (tmp != null && tmp.next != null && tmp.val == tmp.next.val) {
                    tmp = tmp.next;
                }
                cur.next = tmp.next;
            }
            else cur = cur.next;
        }
        return dummy.next;
    }
}