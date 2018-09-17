/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int len = 0;
        ListNode runner = head;
        ListNode tail = head;
        while(runner != null){
            tail = runner;
            runner = runner.next;       
            len++;
        }
        
        runner = head;
        int i = 0;
        while(i < len - k%len -1){
            runner = runner.next;
            i++;
        }
        tail.next = head;
        head = runner.next;
        runner.next = null;
        
        return head;
    }
}