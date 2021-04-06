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
    public ListNode removeElements(ListNode head, int val) {
        // if list is empty
        if (head == null) {
            return null;
        }
        
//         // if there is only 1 elem (head)
//         if (head.next == null && head.val == val){
//             return head;
//         }
        
//         if (head.next == null && head.val != val) {
//             return head;
//         }
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode current = dummyHead;
        
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return dummyHead.next;
    }
}