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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;
        
        // left - left index to start reversing
        // right - right index to stop
        // indexes start from 1
        
        ListNode nextNode = null, prevNode = null, beforeNode = null, curr = head;
        
        // finding the starting point
        for (int i = 1; i < left; i++) {
            prevNode = curr;
            curr = curr.next;
        }
        
        beforeNode = prevNode;
        ListNode temp = curr;
        
        // start reversing
        for (int j = left; j <= right; j++){
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        
        if (beforeNode != null){
            beforeNode.next = prevNode;
        } else {
            head = prevNode;
        }
        
        temp.next = curr;
        
        return head;
    }
}