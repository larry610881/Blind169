package leetcode;
/*
    https://leetcode.com/problems/reverse-bits/description/
 */
public class _190_Reverse_Bits {
    public int reverseBits(int n) {
        int res =0;
        for(int i=0;i<32;i++){
            res<<=1;
            res |=n&1;
            n>>=1;
        }
        return res;
    }
}
