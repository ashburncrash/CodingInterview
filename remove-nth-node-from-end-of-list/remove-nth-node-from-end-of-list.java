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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // naive approach
        // get length of the list then calculate the distance from 1 to n
        // traverse through the list
        // remove
        
//         ListNode curr = head;
//         int length = 0;
        
//         while (curr != null) {
//             length++;
//             curr = curr.next;
//         }
        
//         int fromFront = length - n;
//         ListNode dummyHead = new ListNode(0);
//         dummyHead.next = head;
//         curr = dummyHead;
        
//         for (int i = 1; i <= fromFront; i++) {
//             curr = curr.next;
//         }
        
//         curr.next = curr.next.next;
        
//         return dummyHead.next;
        
        // better approach
        // have two pointers where 1 from head, 2 is n length apart from 1
        // traverse the list until 2 is at the end of the list
        // if 1 matches the elem, remove
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        
        for (int i = 1; i <= n + 1; i++){
            fast = fast.next;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummyHead.next;
    }
}