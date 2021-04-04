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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> unique = new HashSet<Integer>();
        
        ListNode curr = head;
        ListNode prevNode = null;
        
        while (curr != null) {
            // if the value is seen before, remove the node
            // and do not move the prevNode
            if (unique.contains(curr.val)) {
                prevNode.next = curr.next;
            } else {
                // otherwise, add it to the set
                // and move the prevNode to curr
                unique.add(curr.val);
                prevNode = curr;
            }
            curr = curr.next;
        }
        
        return head;
    }
}