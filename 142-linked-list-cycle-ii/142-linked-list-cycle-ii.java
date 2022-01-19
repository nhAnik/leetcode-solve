/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean isCycle = true;
        do {
            if (fast == null || fast.next == null) {
                isCycle = false;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        } while (fast != slow);
        
        if (isCycle) {
             slow = head;
             while (slow != fast) {
                 slow = slow.next;
                 fast = fast.next;
             }
             return slow;
        }
        return null;
    }
}