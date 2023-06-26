package leetcode;
/*
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class _121_Best_Time_to_Buy_and_Sell_Stock {
    /*
        雙層迴圈找出最大值的一組數字差然後記下來
        time complexity = O(n^2)
        超過lc 時間限制
     */
    public int maxProfit(int[] prices) {
        int max =0;
        for(int i=0;i<prices.length;i++){
            for (int j =i+1;j<prices.length;j++){
                max = Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;
    }
    /*
        思路:
            一路找最小值以及最大獲利
     */
    public int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min =prices[i];
            }
            if(prices[i]-min>profit){
                profit =prices[i]-min;
            }
        }
        return profit;
    }
}
