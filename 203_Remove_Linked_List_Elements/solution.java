/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode vh = new ListNode(0);
        vh.next = head;
        ListNode pre = vh, runner = head;
        while(runner!=null){
            if(runner.val == val)
                pre.next = runner.next;
            else
                pre = runner;            
            runner = runner.next;
        }
        
        return vh.next;
    }
}