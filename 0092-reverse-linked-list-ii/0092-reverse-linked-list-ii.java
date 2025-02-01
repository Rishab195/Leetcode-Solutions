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
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
       int i=left-1;
       int j=right-1;
       while(i<j){
        int var=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,var);
        i++;
        j--;
       }
        ListNode finalList=new ListNode(0);
        ListNode current = finalList;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return finalList.next;
}
}