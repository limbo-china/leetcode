class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode vh = new ListNode(0);
        vh.next = head;
        ListNode p1 = vh, p2 = head, p3=null, p4=null;
        p3=(p2 == null) ? null : p2.next;
        while(p3!=null){
            p4 = p3.next;
            p1.next = p3;
            p3.next = p2;
            p2.next = p4;
            
            p1=p2;
            p2=p4;
            p3 = (p4 == null) ? null : p4.next;           
        }
        return vh.next;
    }
}