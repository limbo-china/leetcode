/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, num =0;
        ListNode zero = new ListNode(0);
        zero.next = null;
        ListNode tail = zero;
        while(l1 != null || l2 != null || carry != 0){
            int sum = ((l1 ==null) ? 0 : l1.val)+ ((l2 == null) ? 0 :l2.val) + carry;
            num = sum%10;
            carry = sum/10;
            ListNode n = new ListNode(num);
            tail.next = n;
            tail = tail.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return zero.next;
    }
}