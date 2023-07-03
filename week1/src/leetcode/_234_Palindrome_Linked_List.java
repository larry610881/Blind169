package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/*
    https://leetcode.com/problems/palindrome-linked-list/
 */
public class _234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head =head.next;
        }
        int l = 0;
        int r = list.size()-1;
        while (l<r){
            if(list.get(l) != list.get(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
