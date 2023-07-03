package leetcode;
/*
    https://leetcode.com/problems/number-of-1-bits/description/
 */
public class _191_Number_of_1_Bits {
    public int hammingWeight(int n) {
        int a =1;
        int res =0;
        for(int i =0; i<32;i++){
            if((n&a)!=0){
                res++;
            }
            a<<=1;
        }
        return  res;
    }
}
