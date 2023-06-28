package leetcode;

import java.util.HashMap;

/*

 */
public class _169_Majority_Element {
    public int majorityElement(int[] nums) {
        int cosist =(int)Math.ceil(nums.length/2);
        int maxKey =0;
        int maxValue =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i :nums){
            int amount;
            if(map.containsKey(i)){
                amount = map.get(i)+1;
                if(amount>cosist) return i;

            }else{
                amount =1;
            }
            map.put(i,amount);
            if(amount>maxValue){
                maxKey =i;
                maxValue =amount;
            }
        }
        return  maxKey;
    }
}
