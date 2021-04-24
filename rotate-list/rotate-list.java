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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        
        ListNode curr = head;
        int len = 1;
        
        while (curr != null && curr.next != null) {
            len++;
            curr = curr.next;
        }
        
        curr.next = head; // connect the tail to head (circular)
        
        k = k % len;
        
        for (int i = 1; i <= len - k; i++) {
            curr = curr.next;
        }
        
        // after the loop curr will be at the new tail
        head = curr.next; //new head
        curr.next = null; // new tail
        
        return head;
    }
}