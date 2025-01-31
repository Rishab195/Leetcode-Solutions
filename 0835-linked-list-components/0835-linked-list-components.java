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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
       for(int i:nums ){
        set.add(i);
       }
       int count=0;
       ListNode current=head;
       while(current!=null){
        if(set.contains(current.val) && (current.next==null || !set.contains(current.next.val))){
            count++;
        }
        current=current.next;
       }
       return count;

    }
}