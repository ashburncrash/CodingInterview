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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // for resultant list
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        int sum = 0;
        
        // add values from each node per loop
        // if sum is >= 10, divide by 10 and pass the result to next calculation
        // if sum is >= 10 and on the last node, create a new node
        while (l1 != null || l2 != null) {
            sum += (l1 != null) ? l1.val : 0;
            if (l2 != null) {
                sum += l2.val;   
            } else {
                sum += 0;
            }
            
            if (sum >= 10) {
                int digit = sum % 10;
                curr.next = new ListNode(digit);
                sum = sum / 10;
            } else {
                curr.next = new ListNode(sum);
                sum = 0;
            }
            
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (sum > 0) {
            curr.next = new ListNode(sum);
        }
        
        return dummyHead.next;
    }
}