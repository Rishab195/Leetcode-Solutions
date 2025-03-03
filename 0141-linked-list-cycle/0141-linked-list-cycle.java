/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // if(head==null || head.next==null){
        //     return false;
        // }
        // ListNode fast=head;
        // ListNode slow=head;
        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(fast==slow){
        //         return true;
        //     }
        // }
        // return false;

        Map<ListNode, Boolean> map = new HashMap<>();  

        while (head != null) {
            if (map.containsKey(head)) {  
                return true;
            }
            map.put(head, true);  
            head = head.next;  
        }
        return false;  
    }
}