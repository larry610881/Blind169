package leetcode;


import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/insert-interval/description/
 */
public class _57_Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list =new ArrayList<>();
        boolean added =false;
        for(int i=0; i<intervals.length;i++){
            int[] inter = intervals[i];

            int maxStart =Math.max(inter[0],newInterval[0]);
            int minEnd =Math.min(inter[1],newInterval[1]);

            if(maxStart<=minEnd){
                //有重疊需要merge
                newInterval[0] = Math.min(inter[0],newInterval[0]);
                newInterval[1] = Math.max(inter[1],newInterval[1]);

            }else {
                if(inter[0]>newInterval[1] && added==false){
                    list.add(newInterval);
                    added =true;
                }
                list.add(inter);
            }
        }
        if(added==false){
            list.add(newInterval);
        }
        int[][] res =new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

}
