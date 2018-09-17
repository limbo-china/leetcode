class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ) return null;
        ListNode pre = head;
        ListNode former = head;
        ListNode latter = head;
        while(--n > 0)
            latter = latter.next;
        while(latter.next != null){
            pre = former;
            former = former.next;
            latter = latter.next;
        }
        if(former == head) head = head.next;
        else pre.next = former.next;
        
        return head;
    }
}