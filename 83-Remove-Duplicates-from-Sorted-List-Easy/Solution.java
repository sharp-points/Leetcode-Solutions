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

        if (head == null || head.next == null) {
            return head;
        }

        int previousValue = head.val;
        ListNode prev = head;
        ListNode current = head.next;

        while (true) {
            
            if (current.val == previousValue) {
                prev.next = current.next;
                current = current.next;
                if (current == null) {
                    break;
                }
            } else {
                previousValue = current.val;
                prev = current;
                current = current.next;
                if (current == null) {
                    break;
                }
            }

        }
        
        return head;
    }
}