class Solution {
        // find the middle node
        public  ListNode getmiddle(ListNode head){
        ListNode T=head;
        ListNode H=head.next;
        while(H!=null)
        {
            H=H.next;
            if(H!=null){
            H=H.next;
            }
            T=T.next;
        }
        return T;
    
       
    }
  //delete the middle node
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode curr= getmiddle(head);
        ListNode temp=head;
        while(temp.next!=curr)
        {
            temp=temp.next;
        }
        temp.next=curr.next;
        return head;
       
    }
}
