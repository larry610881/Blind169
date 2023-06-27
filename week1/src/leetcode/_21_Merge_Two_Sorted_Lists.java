package leetcode;

import java.util.List;

/*
    https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class _21_Merge_Two_Sorted_Lists {

      /*
            用兩個指針 一個指向 list1 一個指向list2 分別遍例比大小 直到其中一個指到最後一個(next =null)
            直接將剩餘的指向另一個node 即可
            tip:先建立一個虛擬頭節點
            回傳前再跳過頭節點就好
       */
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode newNode = new ListNode(0);
            ListNode tail =newNode;

            while (list1 !=null && list2 !=null){
                if(list1.val <list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                }else{
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }
            if(list1==null){
                tail.next =list2;
            }else {
                tail.next =list1;
            }

            return  newNode.next;
        }
        /*
                想不出來 思考一下
         */
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {

        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists1(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}
