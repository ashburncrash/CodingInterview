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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // use two pointers to find the cycle
        ListNode fast = head;
        ListNode slow = new ListNode(0);
        slow.next = head;
        
        // if there is a cycle in the list, the two pointers will meet at some point
        // loop through the list
        while (fast != null && fast.next != null) {
            if (fast.val == slow.val) {
                return true;
            }
            
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        return false;
    }
}