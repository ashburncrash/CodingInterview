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
    public ListNode reverseList(ListNode head) {
        
        ListNode prev_node = null, next_node = null;
        
        while (head != null) {
            next_node = head.next;
            head.next = prev_node;
            prev_node = head;
            head = next_node;
        }
        
        return prev_node;
    }
}