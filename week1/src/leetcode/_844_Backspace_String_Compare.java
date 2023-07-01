package leetcode;

import java.util.Stack;

/*
    https://leetcode.com/problems/backspace-string-compare/
 */
public class _844_Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_stack = new Stack<>();
        Stack<Character> t_stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='#'){
                if (!s_stack.isEmpty()){
                    s_stack.pop();
                }

            }else{
                s_stack.push(c);
            }
        }
        for(char c: t.toCharArray()){
            if(c=='#'){
                if (!t_stack.isEmpty()){
                    t_stack.pop();
                }
            }else{
                t_stack.push(c);
            }
        }
        if(s_stack.size()!= t_stack.size()){
            return false;
        }
        while (!s_stack.isEmpty()){
            if(!s_stack.pop().equals(t_stack.pop())){
                return false;
            }
        }
        return true;
    }
}
