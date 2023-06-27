package leetcode;

/*
    https://leetcode.com/problems/climbing-stairs/
 */
public class _70_Climbing_Stairs {
    /*
        變形的費事數列
        time complexity :O(2^n)
     */
    public int climbStairs(int n) {
        if(n<=2) return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    /*
        O(n)
     */
    public int climbStairs1(int n) {
        if(n<=2) return n;
        int n1 =1;
        int n2 =2;
        for(int i=3;i<=n;i++){
            int tmp =n2;
            n2 =n1+n2;
            n1 =tmp;
        }
        return n2;
    }
}
