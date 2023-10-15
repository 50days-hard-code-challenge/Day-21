class Solution {
    public ListNode sortList(ListNode head) {
         if(head==null)
            return head;
        if(head.next==null)
            return head;
        ListNode midNode=findmid(head);
        ListNode h2=midNode.next;
        midNode.next=null;
        ListNode part1=sortList(head);
        ListNode part2=sortList(h2);
        ListNode mergedList=mergeTwoList(part1,part2);
        return mergedList;
        
        }
    private static  ListNode findmid( ListNode head) 
    {
        if(head==null)
            return head;
         ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static  ListNode mergeTwoList( ListNode head1,  ListNode head2) {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
         ListNode t1=head1,t2=head2,tail=null,head=null;
        if(t1.val<=t2.val)
        {
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else
        {
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null &&t2!=null)
        {
            if(t1.val<=t2.val)
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else
            {
                tail.next=t2;
                tail=tail.next;
                t2=t2.next;
            }
        }
        if(t1==null)
            tail.next=t2;
        if(t2==null)
            tail.next=t1;
        return head;

    
    }
}
