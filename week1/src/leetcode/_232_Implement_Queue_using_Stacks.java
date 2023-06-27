package leetcode;
/*
    https://leetcode.com/problems/implement-queue-using-stacks/description/
 */

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    public Stack<Integer> s1 = new Stack<>();
    public Stack<Integer> s2 = new Stack<>();
    public _232_Implement_Queue_using_Stacks() {

    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.isEmpty();
    }
}
