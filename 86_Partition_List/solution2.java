/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode vh1 = new ListNode(0);
        ListNode vh2 = new ListNode(0);
        ListNode tail1 = vh1, tail2 = vh2;
        int c =0 ;
        while(head != null){
            if(head.val < x) {
                tail1.next = head;
                tail1 = tail1.next;
            }
            else{
                tail2.next = head;
                tail2 = tail2.next;
            }
            head = head.next;
        }
        tail2.next = null;
        tail1.next = vh2.next;
    
        return vh1.next;
    }
}