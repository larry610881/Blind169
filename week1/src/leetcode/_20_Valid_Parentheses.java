package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/*
    https://leetcode.com/problems/valid-parentheses/
 */
public class _20_Valid_Parentheses {
    /*
        在java 如果需要遍例string 需要先將string轉成character list
        利用stack 只要看到左邊(,{,[就丟進 stack ,看到右邊),},] 就pop stack卻認為相對應的符號
        另外如果右邊的進去可能會出現stack為空不能pop的情況
        p.s.如果遍例到最後一個值stack還有東西就代表 裡面還有左邊的

        目前題目中 string只包含這幾個符號
     */
    public static boolean isValid(String s){
        List<Character> characterList = new ArrayList<>();
        for(char c:s.toCharArray()){
            characterList.add(c);
        }
        Stack<Character> stack = new Stack<>();
        for (char c:characterList) {
            if(c=='('|c=='['||c=='{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(c==')' &&stack.pop()!='('){
                        return false;
                    }
                    if(c==']' &&stack.pop()!='['){
                        return false;
                    }
                    if(c=='}' &&stack.pop()!='{'){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }

    /*
        延續上一個做優化
        左右括號 有互相對應 一個特定的符號可以對應某特定符號
        因此符號的部分可以使用HashMap做優化
     */
    public static boolean isValid1(String s){
        List<Character> characterList = new ArrayList<>();
        for(char c:s.toCharArray()){
            characterList.add(c);
        }
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (char c:characterList) {
            if(!map.containsKey(c)){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(stack.pop()!=map.get(c)){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
