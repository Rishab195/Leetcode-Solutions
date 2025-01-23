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
    public ListNode middleNode(ListNode head) {
        LinkedList<ListNode> ll = new LinkedList<>();
        while (head != null) {
            ll.add(head);
            head = head.next;
        }
        return ll.get(ll.size() / 2);
    }
}