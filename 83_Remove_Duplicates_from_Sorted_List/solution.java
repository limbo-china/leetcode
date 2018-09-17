/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        int preVal = head.val;
        ListNode pre = head, run = head;
        run = run.next;
        while(run!=null){
            if(run.val == preVal)
                pre.next = run.next; 
            else{
                pre = run;
                preVal = run.val;
            }
            run = run.next;
        }    
        return head;
    }
}