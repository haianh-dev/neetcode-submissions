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
    public ListNode reverseCopy(ListNode head) {
        ListNode newHead = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode newNode = new ListNode(cur.val);
            newNode.next = newHead;
            newHead = newNode;
            cur = cur.next;
        }
        return newHead;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        int count = 0;
        ListNode temp = head;
        while (temp!= null) {
            count++;
            temp = temp.next;
        }

        ListNode head2 = reverseCopy(head);

        ListNode current1 = head.next;
        ListNode current2 = head2;
        ListNode tail = head;

        for (int i = 1; i < count; i++) {
            if (i % 2 == 1) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
        }

        tail.next = null;
    }
}