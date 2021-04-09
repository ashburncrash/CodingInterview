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
        
        if (head == null || head.next == null) {
            return null; // no cycle
        }
        
        // two pointers to detect the cycle
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) {
                break;
            }
        }
        
        // there's no cycle if fast reaches the end of the list
        if (fast == null || fast.next == null) {
            return null;
        }
        
        // find the start of the cycle
        // reset the fast to head
        fast = head;
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
}