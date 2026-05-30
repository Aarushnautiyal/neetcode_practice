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
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode left = head;
        ListNode right = head.next;
        while(left!=right){
            if(right==null||right.next==null)return false;
            left = left.next;
            right = right.next.next;
        }
        return true;
    }
}
