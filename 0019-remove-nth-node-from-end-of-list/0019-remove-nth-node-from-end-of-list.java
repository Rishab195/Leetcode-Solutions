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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;
        ListNode q=dummy;
        for(int i=0;i<=n;i++){
            p=p.next;
        }
        while(p!=null ){
            p=p.next;
            q=q.next;
        }
        q.next=q.next.next;
        return dummy.next;
    }
}