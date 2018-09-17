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
        ListNode vh = new ListNode(Integer.MIN_VALUE);
        vh.next = head;
        ListNode runner = vh, last =vh;
        while(runner != null){
            if(runner.val < x) last = runner;
            runner = runner.next;
        }
        
        runner = vh;
        ListNode pre = vh, mov =null, tail = last;
        
        while(runner != last){
            if(runner.val >= x){
                mov = runner;
                pre.next = mov.next;
                mov.next = tail.next;
                tail.next = mov;
                
                runner= pre.next;
                tail = mov;
                continue;
            }
            pre = runner;
            runner = runner.next;
        }
        
        return vh.next;
    }
}