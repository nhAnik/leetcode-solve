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
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.val));
        for (int i = 0; i < len; i++)
            if (lists[i] != null) pq.add(lists[i]);
        ListNode head, cur;
        head = cur = new ListNode(-1, null);
        while (!pq.isEmpty()) {
            ListNode tmp = pq.poll();
            cur.next = tmp;
            cur = cur.next;
            if (tmp.next != null) pq.add(tmp.next);
        }
        return head.next;
    }
}