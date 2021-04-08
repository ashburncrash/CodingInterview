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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        
        // approach 1: reverse the entire linked list and compare
        // approach 2: reverse the half of linked list and compare
        
        // approach 1
//         ListNode reversedHead = reverseList(head);
        
//         while (head != null) {
//             if (head.val != reversedHead.val) {
//                 return false;
//             }
//             head = head.next;
//             reversedHead = reversedHead.next;
//         }
        
//         return true;
        
        // approach 2
        ListNode slow = head;
        ListNode fast = head;
        
        // move fast twice fast until the end of the list
        // to get slow in the middle node
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // reset the fast to head
        fast = head;
        
        // reverse from slow
        ListNode reversedHead = reverseList(slow);
        
        while (reversedHead != null) {
            if (fast.val != reversedHead.val) {
                return false;
            }
            fast = fast.next;
            reversedHead = reversedHead.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}