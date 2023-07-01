package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
    https://leetcode.com/problems/single-number/
 */
public class _136_Single_Number {
    /*
        使用array 但如果要頻繁進行新增刪除 不建議使用array
     */
    public int singleNumber(int[] nums) {
        List<Integer> array = new ArrayList<>();
        for(int i :nums){
            if(!array.contains(i)){
                array.add(i);
            }else {
                array.remove((Integer) i);
            }
        }
        return array.get(0);
    }
    public int singleNumber1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            if(!map.containsKey(i)){
                map.remove(i);
            }else {
                map.put(i,i);
            }
        }
        return map.entrySet().iterator().next().getKey();
    }
}
