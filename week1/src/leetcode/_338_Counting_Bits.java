package leetcode;
/*
    https://leetcode.com/problems/counting-bits/
 */
public class _338_Counting_Bits {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] =0;
        for(int i =1;i<=n;i++){
            if(i%2==0){
                res[i]=res[i/2];
            }else{
                res[i]=res[i-1]+1;
            }
        }
        return  res;
    }
}
