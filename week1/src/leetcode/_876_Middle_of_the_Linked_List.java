package leetcode;
/*
    https://leetcode.com/problems/middle-of-the-linked-list/description/
 */
public class _876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        if(head.next ==null) return head;
        ListNode secondHead =head.next.next;
        head =head.next;
        while(secondHead!=null&&secondHead.next!=null){
            head =head.next;
            secondHead =secondHead.next;
            if(secondHead!=null){
                secondHead =secondHead.next;
            }
        }
        return head;

    }
}
