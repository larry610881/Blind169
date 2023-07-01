package leetcode;
/*
    https://leetcode.com/problems/reverse-linked-list/
 */
public class _206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode newNode =reverseList(head.next);
        head.next.next =head;
        head.next =null;
        return newNode;

    }
    public ListNode reverseList1(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode newNode =null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = newNode;
            head =tmp;

        }
        return newNode;
    }
}
