/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode vh = new ListNode(0);
        ListNode tail = vh;
        ListNode run1 = l1, run2 = l2;
        while(run1!=null && run2!=null){ 
            if(run1.val < run2.val){
                tail.next = run1; 
                run1 = run1.next;
            }
            else{
                tail.next = run2;
                run2 = run2.next; 
            }
            tail = tail.next;
        }
        tail.next = (run1 == null) ? run2 : run1;
        return vh.next;
    }
}