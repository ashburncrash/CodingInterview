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
    public ListNode middleNode(ListNode head) {
        // non empty
        if (head == null) {
            return null;
        }
        
        // if there are only 1 node
        if (head.next == null) {
            return head;
        }
        
        // two pointers
        ListNode front = head;
        ListNode rear = head;
        
        while (front != null && front.next != null) {
            rear = rear.next;
            front = front.next.next;
        }
        
        return rear;
        
    }
}