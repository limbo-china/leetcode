class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ) return null;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        ListNode former = head;
        ListNode latter = head;
        while(--n > 0)
            latter = latter.next;
        while(latter.next != null){
            pre = former;
            former = former.next;
            latter = latter.next;
        }
        pre.next = former.next;
        
        return start.next;
    }
}