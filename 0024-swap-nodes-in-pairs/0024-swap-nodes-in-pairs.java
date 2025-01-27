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
        public void recur(ListNode head){
            if(head==null || head.next==null){
                return;
            }
            int temp=head.val;
            head.val=head.next.val;
            head.next.val=temp;
            recur(head.next.next);
        }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        recur(head);
        return head;
    }
}

